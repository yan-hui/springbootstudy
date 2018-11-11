package lone.wolf.springbootstudy.controller;

import lone.wolf.springbootstudy.config.MySetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/11/11 18:05
 */
@Controller
@RequestMapping("/freemarker")
public class MyController {
    @Autowired
    private MySetting setting;
    @RequestMapping("/index")
    public String toFreemarker(ModelMap modelMap){
        modelMap.addAttribute("name",setting.getName());
        modelMap.addAttribute("age",setting.getAge());
        return "fm/index";
    }
}
