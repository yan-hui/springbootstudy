package lone.wolf.springbootstudy;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootstudyApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("啊实打实大苏打上");
        TestCase.assertEquals(1,1);
    }

}
