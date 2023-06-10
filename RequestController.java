package com.aliang.controller;


import com.aliang.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

@RestController
public class RequestController {
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request){
//        String name = request.getParameter("name");
//        String agestr = request.getParameter("age");
//        int age = Integer.parseInt(agestr);
//        System.out.println(name+age);
//        return "OK";
//
//    }
//    @RequestMapping("/simpleParam")
//    public String simpleParam(@RequestParam(name = "name", required = false) String username, Integer age){
//        System.out.println(username+age);
//        return "OK";
//
//    }
//    @RequestMapping("/simplePojo")
//    public String simplePojo(User user){
//        System.out.println(user);
//        return "ok";
//    }
//    @RequestMapping("/simplePojo1")
//    public String simplePojo1(User user){
//        System.out.println(user);
//        return "ok";
//    }
//    @RequestMapping("/simpleArrays")
//    public String simpleArrays(String[] hobby){
//        Arrays.stream(hobby).forEach(s-> System.out.println(s));
//        return "ok";
//    }
//    @RequestMapping("/simpleList")
//    public String simpleList(@RequestParam List<String> hobby){
////        Arrays.stream(hobby).forEach(s-> System.out.println(s));
//        System.out.println(hobby);
//        return "ok";
//    }
//    @RequestMapping("/dateParam")
//    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime){
//        System.out.println(updateTime);
//        return "ok";
//    }
//    @RequestMapping("/jsonParam")
//    public String jsonParam(@RequestBody User user){
//        System.out.println(user);
//        return "ok";
//    }
    @RequestMapping("/path/{id}")
    public String pathParam(@PathVariable Integer id){
        System.out.println(id);
        return "ok";
    }
}
