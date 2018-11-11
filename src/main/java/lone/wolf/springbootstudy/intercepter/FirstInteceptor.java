package lone.wolf.springbootstudy.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/11/7 23:30
 */

public class FirstInteceptor implements HandlerInterceptor {
    /**
     * 进入controller前执行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("FirstInteceptor--->preHandle");
        return HandlerInterceptor.super.preHandle(request,response,handler);
    }

    /**
     * 调用完controller之后，视图渲染之前执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //String access_token = request.getHeader("access_token");
        //response.getWriter().print("file");
        System.out.println("FirstInteceptor--->postHandle");
        HandlerInterceptor.super.postHandle(request,response,handler,modelAndView);
    }

    /**
     * 全部完成之后，一般用于资源清理
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("FirstInteceptor--->afterCompletion");
        HandlerInterceptor.super.afterCompletion(request,response,handler,ex);
    }
}
