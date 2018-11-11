package lone.wolf.springbootstudy.controller;

import lone.wolf.springbootstudy.config.MySetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/11/11 19:48
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeLeafContorller {
    @Autowired
    private MySetting setting;

    @GetMapping("/index")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("setting", setting);
        return "info";
    }
}
