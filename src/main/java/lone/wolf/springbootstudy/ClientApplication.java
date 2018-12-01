package lone.wolf.springbootstudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/*@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}*/
/**
 *
 * @Description 通过war启动
 * @Author hch
 * @Created 2018/11/5 21:54
 *
 */
@SpringBootApplication
@ServletComponentScan
//mybatis扫描
@MapperScan("lone.wolf.springbootstudy.mapper")
//开启定时任务
//@EnableScheduling
//开启异步任务
//@EnableAsync
//开启支持jms
@EnableJms
public class ClientApplication /*extends SpringBootServletInitializer*/ {
  /*  @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ClientApplication.class);
    }*/

    public static void main(String[] args) {
        // 设置环境变量，解决Es的netty与Netty服务本身不兼容问题
        //System.setProperty("es.set.netty.runtime.available.processors","false");
        SpringApplication.run(ClientApplication.class, args);
    }
}