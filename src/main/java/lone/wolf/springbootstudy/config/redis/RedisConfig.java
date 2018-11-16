package lone.wolf.springbootstudy.config.redis;

import org.springframework.context.annotation.Configuration;

import java.time.Duration;

/**
 * @Description
 * @Author hechunhui
 * @CreatedBy 2018/11/16 11:05
 */
@Configuration
public class RedisConfig {
	private static String REDIS_HOST = null;
	private static String REDIS_PORT = null;
	private static String REDIS_PASSWORD = null;
	private static Integer REDIS_MAX_IDLE = null;
	private static Integer REDIS_MIN_IDLE = null;
	private static Duration REDIS_MAX_WAIT = null;
	private static Integer REDIS_MAX_ACTIVE = null;
	private static Duration REDIS_TIMEOUT = null;

	static {

	}


}
