/*
package com.example.demo.controller;

import com.example.demo.pojo.Author;
import com.example.demo.pojo.Book;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Controller {
    @GetMapping("/hi")
    public String hi(){
        int i = 1/0;
        return "hi spring boot";
    }

    @GetMapping("/hello")
    public void hello(Model model){
        Map<String,Object> map = model.asMap();
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            Object value = map.get(key);
            System.out.println(key+">>>>>>"+value);
        }
    }

    @GetMapping("/book")
    public String book(@ModelAttribute("b") Book book, @ModelAttribute("a") Author author){
        return book.toString()+">>>>>>>"+author.toString();
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @Autowired
    UserService userService;

    @GetMapping("/getUserById")
    public String getUserById(Integer id){
        return userService.getUserById(id);
    }

    @GetMapping("/deleteUserById")
    public void deleteUserById(Integer id){
        userService.deleteUserById(id);
    }


}
*/
