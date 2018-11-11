package lone.wolf.springbootstudy.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/11/5 22:50
 */
@WebFilter(urlPatterns = "/api/*",filterName = "LoginFilter")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("innit LoginFilter!!!");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter LoginFilter!!");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        String username = request.getParameter("username");
        if ("hch".equals(username)){
            filterChain.doFilter(request,response);
        }
    }

    @Override
    public void destroy() {
        System.out.println("destroy LoginFilter!!!");
    }
}
