package cn.littleisle.singlelogin.business.vojo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserVo {
    private Long id;

    @NotEmpty(message="用户名不能为空！")
    private String userName;

    private String nickName;

    @Size(min=6,max=10,message = "密码长度必须6到10位")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
