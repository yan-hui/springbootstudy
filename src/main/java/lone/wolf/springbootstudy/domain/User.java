package lone.wolf.springbootstudy.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @Description
 * @CreateBy hechunhui
 * @created 2018/11/1$ 21:53$
 */
public class User {
    private int id;

    //@JsonProperty("userName")
    private String name;
    @JsonIgnore
    private String pwd;

    private int age;




    //@JsonProperty("account")
    //@JsonInclude(JsonInclude.Include.NON_NULL)
    private String phone;
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date createTime;

    public User() {
    }

    public User(String name, String pwd, int age, String phone, Date createTime) {
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.phone = phone;
        this.createTime = createTime;
    }

    public User(int id, String name, String pwd, int age, String phone, Date createTime) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.phone = phone;
        this.createTime = createTime;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
