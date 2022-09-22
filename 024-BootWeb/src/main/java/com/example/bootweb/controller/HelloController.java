package com.example.bootweb.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Qiao
 * @Create 2022/6/22 20:59
 */

@RestController
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public HashMap<String,String> deleteUser(){
        HashMap<String, String> map = new HashMap<String,String>();
        map.put("1","2");
        return map;
    }

//    @RequestMapping(value = "/user", method = RequestMethod.POST
    @PostMapping("/user")
    public Map<String,String> postUser(){
        Map<String, String> map = new HashMap<>();
        map.put("1","2");
        return map;
    }
}
