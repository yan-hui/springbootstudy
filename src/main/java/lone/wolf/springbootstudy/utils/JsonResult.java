package lone.wolf.springbootstudy.utils;

import lombok.Data;

/**
 * @Description 接口请求返回数据结果工具类
 * @Author hechunhui
 * @CreatedBy 2018/11/12 10:21
 */
@Data
public class JsonResult<T> {
	/**
	 * 状态码
	 */
	private Integer code;
	/**
	 * 数据结果
	 */
	private T data;
	/**
	 * 信息描述
	 */
	private String msg;

	private JsonResult(Integer code, T data, String msg) {
		this.code = code;
		this.data = data;
		this.msg = msg;
	}

	public static <T> JsonResult<T> success(){
		return new JsonResult<T>(RequestConstants.SUCCESS_CODE,null,RequestConstants.SUCCESS_MSG);
	}
	public static <T> JsonResult<T> success(T data){
		return new JsonResult<T>(RequestConstants.SUCCESS_CODE,data,RequestConstants.SUCCESS_MSG);
	}
	public static <T> JsonResult<T> success(Integer code, T data){
		return new JsonResult<T>(code,data,RequestConstants.SUCCESS_MSG);
	}
	public static <T> JsonResult<T> success(Integer code, T data, String msg){
		return new JsonResult<T>(code,data,msg);
	}

	public static <T> JsonResult<T> fail(){
		return new JsonResult<T>(RequestConstants.FAIL_CODE,null,RequestConstants.FAIL_MSG);
	}
	public static <T> JsonResult<T> fail(T data){
		return new JsonResult<T>(RequestConstants.FAIL_CODE,data,RequestConstants.FAIL_MSG);
	}
	public static <T> JsonResult<T> fail(Integer code, T data){
		return new JsonResult<T>(code,data,RequestConstants.FAIL_MSG);
	}
	public static <T> JsonResult<T> fail(Integer code, T data, String msg){
		return new JsonResult<T>(code,data,msg);
	}

}
