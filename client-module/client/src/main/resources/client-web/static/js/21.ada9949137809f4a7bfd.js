webpackJsonp([21],{"4/WD":function(e,t,s){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=s("LPk9"),a=s("FJop"),o={data:function(){return{fellPathSetInterval:null,encrypted:!1,imageUrl:"",keyStorePath:"",keyStoreInfo:{},importAccountLoading:!1}},components:{Back:n.a,Password:a.a},mounted:function(){},methods:{keystore:function(){var e=this,t=document.getElementById("fileId");t.click();this.fellPathSetInterval=setInterval(function(){if(""!==e.getFullPath(t)){var s=document.getElementById("fileId"),n=document.querySelector("#preview");if(window.FileReader)if("keystore"===s.files[0].name.toLowerCase().split(".").splice(-1)[0]){if(window.FileReader){var a=s.files[0],o=new FileReader;o.onload=function(){n.innerHTML=this.result},o.readAsText(a),setTimeout(function(){var t=JSON.parse(n.innerHTML);if(e.keyStoreInfo={address:"null"===t.address?null:t.address,encryptedPrivateKey:"null"===t.encryptedPrivateKey?null:t.encryptedPrivateKey,alias:"null"===t.alias?null:t.alias,pubKey:"null"===t.pubKey?null:t.pubKey,prikey:"null"===t.prikey?null:t.prikey},"null"!==JSON.parse(n.innerHTML).encryptedPrivateKey&&null!==JSON.parse(n.innerHTML).encryptedPrivateKey)e.encrypted=!0,e.$refs.password.showPassword(!0);else{var s={accountKeyStoreDto:e.keyStoreInfo,password:"",overwrite:!1};e.postKeyStore("/account/import",s)}},500)}}else s.outerHTML=s.outerHTML,e.$message({type:"warning",message:e.$t("message.c194"),duration:"2000"});clearInterval(e.fellPathSetInterval)}},500)},upload:function(e){if(window.FileReader){var t=e.files[0],s=(t.name.split(".")[0],new FileReader);s.onload=function(){return this.result},s.readAsText(t)}return!0},getFullPath:function(e){if(e)return window.navigator.userAgent.indexOf("MSIE")>=1?(e.select(),document.selection.createRange().text):window.navigator.userAgent.indexOf("Firefox")>=1&&e.files?e.files.item(0).getAsDataURL():e.value},toClose:function(e){e||(document.getElementById("fileId").value="")},toSubmit:function(e){var t={accountKeyStoreDto:this.keyStoreInfo,password:e,overwrite:!1};this.postKeyStore("/account/import",t);var s=document.getElementById("fileId");s.outerHTML=s.outerHTML},postKeyStore:function(e,t){var s=this;this.importAccountLoading=!0,this.$post(e,t).then(function(e){e.success?(document.querySelector("#preview").innerHTML="",localStorage.setItem("newAccountAddress",e.data.value),localStorage.setItem("encrypted",s.encrypted.toString()),s.getAccountList("/account"),s.$message({type:"success",message:s.$t("message.passWordSuccess")})):s.$message({type:"warning",message:s.$t("message.passWordFailed")+e.data.msg});s.importAccountLoading=!1}).catch(function(e){s.getAccountList("/account"),s.$message({type:"success",message:s.$t("message.c197"),duration:"3000"}),s.importAccountLoading=!1})},getAccountList:function(e){var t=this;this.$fetch(e).then(function(e){e.success&&(t.$store.commit("setAddressList",e.data.list),1===e.data.list.length?t.$router.push({name:"/wallet"}):t.$router.push({name:"/userInfo",params:{address:e.data}}))}).catch(function(e){console.log("User List err"+e)})},importKey:function(){this.$router.push({path:"/firstInto/firstInfo/importKey"})}}},r={render:function(){var e=this,t=e.$createElement,s=e._self._c||t;return s("div",{directives:[{name:"loading",rawName:"v-loading",value:e.importAccountLoading,expression:"importAccountLoading"}],staticClass:"import-account"},[s("Back",{attrs:{backTitle:this.$t("message.firstInfoTitle")}}),e._v(" "),s("h1",[e._v(e._s(e.$t("message.inportAccount")))]),e._v(" "),s("input",{staticClass:"hidden",attrs:{type:"file",id:"fileId"}}),e._v(" "),s("p",{staticClass:"hidden",attrs:{id:"preview",value:""}}),e._v(" "),s("div",{staticClass:"keystore",on:{click:e.keystore}},[s("h1",[e._v(e._s(e.$t("message.c189")))]),e._v(" "),s("p",[e._v(e._s(e.$t("message.c190"))),s("br"),e._v(e._s(e.$t("message.c191")))]),e._v(" "),s("h3",{directives:[{name:"show",rawName:"v-show",value:!1,expression:"false"}]},[e._v("\n      "+e._s(e.$t("message.c192"))+"\n    ")])]),e._v(" "),s("div",{staticClass:"key text-d cursor-p",on:{click:e.importKey}},[e._v(e._s(e.$t("message.c193")))]),e._v(" "),s("Password",{ref:"password",on:{toSubmit:e.toSubmit,toClose:e.toClose}})],1)},staticRenderFns:[]};var i=s("vSla")(o,r,!1,function(e){s("qmzb")},null,null);t.default=i.exports},qmzb:function(e,t){}});