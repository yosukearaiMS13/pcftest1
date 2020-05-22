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
        Map<String,Object> map = new HashMap<String,Object>();
        Map<String,String> innerMap = new HashMap<String,String>();
        innerMap.put("Yosuke_i1","foobar");
        innerMap.put("Yosuke_i2","hoge");
        
        map.put("Yosuke","Hello!");
        map.put("Yosuke2",innerMap);
        return map;
    }

/*     public String getHello(){
        return "hello world";
    }
 */
}