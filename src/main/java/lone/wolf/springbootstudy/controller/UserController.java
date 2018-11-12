package lone.wolf.springbootstudy.controller;

import lone.wolf.springbootstudy.domain.JsonData;
import lone.wolf.springbootstudy.domain.User;
import lone.wolf.springbootstudy.service.UserService;
import lone.wolf.springbootstudy.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/11/11 21:47
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/add")
    public Object add(){
        User user = new User();
        user.setAge(23);
        user.setCreateTime(new Date());
        user.setName("hch");
        user.setPwd("123456");
        user.setPhone("12345678901");
        int id = userService.add(user);
        return JsonData.buildSuccess("200",id);
    }
    @GetMapping("/getAll")
    public JsonResult<List<User>> getAll(){
        return JsonResult.success(userService.getAll());

    }

}
