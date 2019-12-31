package test.model;

import java.io.Serializable;

/**
 * Created by gongshunqiang on 2019/12/31
 */
public class A implements Serializable {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
