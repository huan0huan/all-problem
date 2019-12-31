package test.model;

import java.io.Serializable;

/**
 * Created by gongshunqiang on 2019/12/31
 */
public class B implements Serializable {
    private String nickName;
    private String remark;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
