package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Qiao
 * @Create 2022/5/17 08:49
 */

@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
