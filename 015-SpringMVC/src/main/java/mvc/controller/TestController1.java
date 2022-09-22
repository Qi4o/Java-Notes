package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Qiao
 * @Create 2022/5/2 14:40
 */

@Controller
@RequestMapping("/test")
public class TestController1 {

    @RequestMapping("/success")
    public String success(){
        return "test/success";
    }
}
