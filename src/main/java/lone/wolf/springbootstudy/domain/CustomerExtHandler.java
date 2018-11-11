package lone.wolf.springbootstudy.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/11/4 21:32
 */
@RestControllerAdvice
public class CustomerExtHandler {
    private static final Logger LOG = LoggerFactory.getLogger(CustomerExtHandler.class);
    /**
     * 捕获全局异常，处理所以不可知的异常
     * @param e
     * @param request
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    Object handlerException(Exception e, HttpServletRequest request){
        LOG.error("url {} ,msg {}",request.getRequestURL(),e.getMessage());
        Map<String,Object> map = new HashMap<>();
        map.put("code",100);
        map.put("msg",e.getMessage());
        map.put("url",request.getRequestURL());
        return map;
    }

}
