package lone.wolf.springbootstudy.domain;

import java.io.Serializable;

/**
 * @Description 数据返回格式
 * @CreateBy hechunhui
 * @created 2018/11/1$ 23:20$
 */
public class JsonData implements Serializable {

    private String code;
    private Object data;
    private String msg;

    public JsonData(String code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public JsonData(String code, Object data) {
        this.code = code;
        this.data = data;
    }

    public static JsonData buildSuccess(String code,Object data){
        return new JsonData(code,data);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
