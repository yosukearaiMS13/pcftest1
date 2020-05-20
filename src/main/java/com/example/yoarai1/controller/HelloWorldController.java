package com.example.yoarai1.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Map getHello(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("Yosuke","Hello!");
        map.put("Yosuke2","Hello2!");
        map.put("Yosuke3","Hello3!");
        return map;
    }

/*     public String getHello(){
        return "hello world";
    }
 */
}