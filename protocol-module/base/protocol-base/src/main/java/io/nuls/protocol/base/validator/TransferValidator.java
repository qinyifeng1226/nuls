/*
 * MIT License
 *
 * Copyright (c) 2017-2018 nuls.io
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package io.nuls.protocol.base.validator;

import io.nuls.kernel.constant.TransactionErrorCode;
import io.nuls.kernel.exception.NulsException;
import io.nuls.kernel.lite.annotation.Component;
import io.nuls.kernel.model.Coin;
import io.nuls.kernel.script.SignatureUtil;
import io.nuls.kernel.script.TransactionSignature;
import io.nuls.kernel.utils.AddressTool;
import io.nuls.kernel.validate.NulsDataValidator;
import io.nuls.kernel.validate.ValidateResult;
import io.nuls.protocol.constant.ProtocolConstant;
import io.nuls.protocol.model.tx.TransferTransaction;

import java.util.Set;

/**
 * @author: Niels Wang
 * @date: 2018/7/5
 */
@Component
public class TransferValidator implements NulsDataValidator<TransferTransaction> {

    @Override
    public ValidateResult validate(TransferTransaction tx) throws NulsException {
        Set<String> addressSet = SignatureUtil.getAddressFromTX(tx);
        for (Coin coin : tx.getCoinData().getTo()) {
            byte[] owner = coin.getOwner();
            if (owner.length > 23) {
                owner = coin.getAddress();
            }
            // Keep the change maybe a very small coin
            if (addressSet.contains(AddressTool.getStringAddressByBytes(owner))) {
                // When the receiver sign this tx,Allow it transfer small coin
                continue;
            }

            if (coin.getNa().isLessThan(ProtocolConstant.MININUM_TRANSFER_AMOUNT)) {
                return ValidateResult.getFailedResult(this.getClass().getSimpleName(), TransactionErrorCode.TOO_SMALL_AMOUNT);
            }
        }
        return ValidateResult.getSuccessResult();
    }
}
