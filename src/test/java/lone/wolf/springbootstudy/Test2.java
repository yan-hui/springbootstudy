package lone.wolf.springbootstudy;

import lone.wolf.springbootstudy.config.ApplicationProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @Description 测试mockmvc
 * @Author hechunhui
 * @Created 2018/11/4 20:39
 */
@RunWith(SpringRunner.class)//底层使用junit,SpringJUnit4ClassRunner
@SpringBootTest//启动整个Springboot工程
@AutoConfigureMockMvc
public class Test2 {
    @Autowired
    private MockMvc mockMvc;//相当于HTTP客户端

    @Test
    public void testController() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/hot")).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        int status = mvcResult.getResponse().getStatus();
        System.out.println(status);

    }

    @Test
    public void testUtil(){
        String localhoost = ApplicationProperties.getProperties("spring.redis.host", "localhoost");
        System.out.println(localhoost);
        Integer integer = ApplicationProperties.getInteger("spring.redis.host", 111);
        System.out.println("输出: "+integer);
        String properties = ApplicationProperties.getProperties("spring.redis.jedis.pool.max-wait", null);
        System.out.println("输出: "+properties);
    }
}
