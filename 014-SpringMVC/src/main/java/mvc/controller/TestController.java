package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Qiao
 * @Create 2022/4/24 13:34
 */

@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }


}
