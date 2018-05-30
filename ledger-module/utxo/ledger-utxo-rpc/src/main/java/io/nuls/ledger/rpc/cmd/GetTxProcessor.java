package io.nuls.ledger.rpc.cmd;

import io.nuls.core.tools.date.DateUtil;
import io.nuls.kernel.model.RpcClientResult;
import io.nuls.kernel.utils.CommandBuilder;
import io.nuls.core.tools.str.StringUtils;
import io.nuls.kernel.constant.KernelErrorCode;
import io.nuls.kernel.model.CommandResult;
import io.nuls.kernel.model.Result;
import io.nuls.kernel.processor.CommandProcessor;
import io.nuls.kernel.utils.CommandHelper;
import io.nuls.kernel.utils.RestFulUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class GetTxProcessor implements CommandProcessor {

    private RestFulUtils restFul = RestFulUtils.getInstance();

    @Override
    public String getCommand() {
        return "gettx";
    }

    @Override
    public String getHelp() {
        CommandBuilder bulider = new CommandBuilder();
        bulider.newLine(getCommandDescription())
                .newLine("\t<hash>   transaction hash -required");
        return bulider.toString();
    }

    @Override
    public String getCommandDescription() {
        return "gettx <hash> --get the transaction information by txhash";
    }

    @Override
    public boolean argsValidate(String[] args) {
        int length = args.length;
        if (length != 2) {
            return false;
        }
        return true;
    }

    @Override
    public CommandResult execute(String[] args) {
        String hash = args[1];
        if(StringUtils.isBlank(hash)) {
            return CommandResult.getFailed(KernelErrorCode.PARAMETER_ERROR.getMsg());
        }
        RpcClientResult result = restFul.get("/tx/hash/" + hash, null);
        if (result.isFailed()) {
            return CommandResult.getFailed(result.getMsg());
        }
        Map<String, Object> map = (Map)result.getData();
        map.put("deposit", CommandHelper.naToNuls(map.get("deposit")));
        map.put("fee", CommandHelper.naToNuls(map.get("fee")));
        map.put("value", CommandHelper.naToNuls(map.get("value")));
        map.put("time",  DateUtil.convertDate(new Date((Long)map.get("time"))));
        map.put("status", statusExplain((Integer)map.get("status")));

        List<Map<String, Object>> inputs = (List<Map<String, Object>>)map.get("inputs");
        for(Map<String, Object> input : inputs){
            input.put("value", CommandHelper.naToNuls(input.get("value")));
        }
        List<Map<String, Object>> outputs = (List<Map<String, Object>>)map.get("inputs");
        for(Map<String, Object> output : outputs){
            output.put("value", CommandHelper.naToNuls(output.get("value")));
            output.put("status", statusExplainForOutPut((Integer) output.get("status")));
        }
        result.setData(map);
        return CommandResult.getResult(result);
    }

    private String statusExplain(Integer status){
        if(status == 0){
            return "unConfirm";
        }
        if(status == 1){
            return"confirm";
        }
        return "unknown";
    }

    /**
     * 状态 0:usable(未花费), 1:timeLock(高度锁定), 2:consensusLock(参与共识锁定), 3:spent(已花费)
     * @param status
     * @return
     */
    private String statusExplainForOutPut(Integer status){
        if(status == 0){
            return "usable";
        }
        if(status == 1){
            return"timeLock";
        }
        if(status == 2){
            return"consensusLock";
        }
        if(status == 3){
            return"spent";
        }
        return "unknown";
    }
}
