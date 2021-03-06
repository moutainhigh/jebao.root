package com.jebao.thirdPay.fuiou.model.preAuth;

import com.jebao.thirdPay.fuiou.constants.FuiouConfig;
import com.jebao.thirdPay.fuiou.model.base.BaseRequest;
import com.jebao.thirdPay.fuiou.util.Common;

/**
 * Created by Administrator on 2016/9/27.
 */
public class PreAuthRequest extends BaseRequest {


    private String out_cust_no; //出账账户
    private String in_cust_no; //入账账户
    private String amt; //预授权金额
    private String rem; //备注
    private String signature; //签名数据


    public String getOut_cust_no() {
        return out_cust_no;
    }

    public void setOut_cust_no(String out_cust_no) {
        this.out_cust_no = out_cust_no;
    }

    public String getIn_cust_no() {
        return in_cust_no;
    }

    public void setIn_cust_no(String in_cust_no) {
        this.in_cust_no = in_cust_no;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
    /**
     * 预授权接口请求的明文
     *
     * @return
     */
    public String requestSignPlain() {
        String src = amt + "|" + in_cust_no +"|"+ mchnt_cd + "|" + mchnt_txn_ssn +"|"+ out_cust_no +"|"+ rem;
        return src;
    }
}
