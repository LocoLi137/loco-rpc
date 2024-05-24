package loco.rpc.common.model;

import java.io.Serializable;

/**
 * description: 用户实体
 * author: Loco.Li
 */
public class User implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
