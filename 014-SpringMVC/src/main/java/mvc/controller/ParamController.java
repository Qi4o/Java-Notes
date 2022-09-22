package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Qiao
 * @Create 2022/4/25 16:37
 */

@Controller
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username, String password, String hobby) {
        System.out.println("username = " + username + "; password = " + password + "; hobby = " + hobby);
        return "success";
    }


}
