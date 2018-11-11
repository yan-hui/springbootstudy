package lone.wolf.springbootstudy.controller;

import lone.wolf.springbootstudy.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 测试http协议的get请求
 * @CreateBy hechunhui
 * @created 2018/10/31$ 22:59$
 */
@RestController
public class SimpleController {
   private Map<String,Object> params = new HashMap<>();

    /**
     * 测试restful协议，从路径中获取字段
     * @param cityId
     * @param userId
     * @return
     */
   @RequestMapping(path = "/v1/{city_id}/{user_id}",method = RequestMethod.GET)
   public Object findUser(@PathVariable("city_id") String cityId,@PathVariable("user_id")String userId){
    params.clear();
    params.put("cityId",cityId);
    params.put("userId",userId);
    return params;
   }
   @GetMapping("/getUser")
   public Object getUser(){
       return new User("anni","123456",25,null,new Date());
   }
   @GetMapping("/api/hot")
   public User testHot(){
       System.out.println("wwww");
       //int s =1/0;
    return new User("nani","qwe",22,"123",new Date());

   }
   @GetMapping("/api2/hot")
   public User testHot2(){
       System.out.println("wwww");
       //int s =1/0;
    return new User("nani","qwe",22,"123",new Date());

   }
   @GetMapping("/api3/hot")
   public User testHot3(){
       System.out.println("wwww");
       //int s =1/0;
    return new User("nani","qwe",22,"123",new Date());

   }
}
