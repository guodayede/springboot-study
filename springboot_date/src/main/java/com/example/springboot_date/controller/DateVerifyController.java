package com.example.springboot_date.controller;


import com.example.springboot_date.model.DateModelNoAnnotation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author gyc
 * @title: DateVerifyController
 * @projectName test
 * @date 2019/8/2811:07
 * @description: TODO
 */

@RestController
@RequestMapping("/date")
public class DateVerifyController {
//    方式一
    @PostMapping("/no")
    public String dateUnNoAnnotation(DateModelNoAnnotation dateModelNoAnnotation){
        System.out.println(dateModelNoAnnotation.toString());
        return "SUCCESS";
    }

//    方式二
    @PostMapping("/has")
    public String dateHasAnnotation(@RequestBody DateModelNoAnnotation dateModelNoAnnotation){
        System.out.println(dateModelNoAnnotation.toString());
        return "SUCCESS";
    }
//    方式三
    @GetMapping("/param")
    public String dateParams(@RequestParam("id")Integer id, @RequestParam("receiveDate")Date receiveDate){
        System.out.println("id====="+id);
        System.out.println("receiveDate====="+receiveDate);
        System.out.println("receiveDate====="+receiveDate.getTime());
        return "SUCCESS";
    }
//    方式四
    @GetMapping("/no/param")
    public String dateNoParams(Integer id,Date receiveDate){
        System.out.println("id====="+id);
        System.out.println("receiveDate====="+receiveDate);
        System.out.println("receiveDate====="+receiveDate.getTime());
        return "SUCCESS";
    }
}