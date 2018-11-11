package lone.wolf.springbootstudy.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Description 上下文监听器，一般用于资源加载
 * @Author hechunhui
 * @Created 2018/11/7 22:58
 */
@WebListener
public class UserContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContextListener init.....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContextListener destroy.......");

    }
}
