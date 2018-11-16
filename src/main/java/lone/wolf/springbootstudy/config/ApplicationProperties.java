package lone.wolf.springbootstudy.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * @Description
 * @Author hechunhui
 * @CreatedBy 2018/11/16 11:22
 */
public class ApplicationProperties {
	private static Logger logger = LoggerFactory.getLogger(ApplicationProperties.class);
	private final static String DEFAULT_PROPERTIES = "application.properties";
	private static Properties properties;

	static {
		Resource resource = new ClassPathResource(DEFAULT_PROPERTIES);
		try {
			properties = PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
			logger.error("配置文件加载失败!", e);
		}
	}

	/**
	 * 获取普通配置信息
	 *
	 * @param key
	 * @param defalutValue
	 * @return
	 */
	public static String getProperties(String key, String defalutValue) {
		String property = properties.getProperty(key, defalutValue);
		return property;
	}

	public static Integer getInteger(String key, Integer defalutValue) {
		String value = properties.getProperty(key, String.valueOf(defalutValue));
		Integer returnVal;
		try {
			returnVal = Integer.valueOf(value);
		} catch (NumberFormatException e) {
			returnVal = defalutValue;
			logger.error("无法将类型转为integer", e);
		}
		return returnVal;
	}

}
