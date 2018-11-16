package lone.wolf.springbootstudy.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

/**
 * @Description 文件上传配置类
 * @Author hch
 * @Created 2018/11/4 14:52
 *
 */
@Configuration
public class FileConfig {
    /**
     * 设置文件上传的大小限制
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //2014KB,单个文件最大限制
        DataSize size = DataSize.ofKilobytes(1024);
        factory.setMaxFileSize(size);
        //2MB，总上传的数据大小限制
        factory.setMaxRequestSize(DataSize.ofMegabytes(2));
        return factory.createMultipartConfig();
    }
}
