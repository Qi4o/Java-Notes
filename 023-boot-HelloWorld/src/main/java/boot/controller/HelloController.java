package boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Qiao
 * @Create 2022/6/16 22:24
 */

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String handle01(){
        return "hello, spring boot 2";
    }

    @RequestMapping("test")
    public String test(){
        return "test";
    }
}
