package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author Qiao
 * @Create 2022/4/24 16:14
 */

@Controller
@RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping(
            value = "/testRequestMapping",
            method = RequestMethod.GET
    )
    public String success() {
        return "success";
    }
}
