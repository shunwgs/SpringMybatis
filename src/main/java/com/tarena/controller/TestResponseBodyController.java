package com.tarena.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/responseBody")
public class TestResponseBodyController {
    
    @RequestMapping("/test3")
    @ResponseBody
    public List<String> f3(){
        List<String> list = new ArrayList<String>();
        list.add("spring");
        list.add("mybatis");
        list.add("strus");
        return list;
    }
    
}
