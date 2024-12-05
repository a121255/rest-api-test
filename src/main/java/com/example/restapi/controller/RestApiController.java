package com.example.restapi.controller;

import com.example.restapi.model.BookQueryParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path = "/hello")
    public String hello(){
        var html = "<html><body><h1> 으아아아 </h1></body></html>";
        return html;
    }

    @GetMapping(path = "/echo/{message}/age/{age}/is-man/{isMan}")
    public String echo(@PathVariable(name="message") String msg,
                       @PathVariable int age,
                       @PathVariable boolean isMan){
        System.out.println("echo message : " + msg);
        System.out.println("echo age : " + age);
        System.out.println("echo isMan : " + isMan);

        // TODO 대문자로 변환해서 RETURN
        //String 타입으 변수 외 다른 변수 받아보기

        return msg;
    }

    @GetMapping(path = "/book")
    public void queryParam(@RequestParam String category,
                           @RequestParam String issuedYear,
                           @RequestParam(name="issued-month") String issuedMonth,
                           @RequestParam(name="issued-day") String issued_day){
        System.out.println(category);
        System.out.println(issuedYear);
        System.out.println(issuedMonth);
        System.out.println(issued_day);
    }

    @GetMapping(path = "/book2")
    public void queryParamDto(BookQueryParam bookQueryParam){
        System.out.println(bookQueryParam);
        System.out.println(bookQueryParam.getCategory());

        // TODO Parameter 2가지, int로 받아서 덧셈, 곱셈
        // TODO String 타입 boolean 타입
    }

    @GetMapping(path = "/add/{num1}/{num2}")
    public int queryAddNumbers(@PathVariable int num1, @PathVariable int num2){
        return num1 + num2;
    }

    @GetMapping(path = "/multiply/{num1}/{num2}")
    public int queryMultiplyNumbers(@PathVariable int num1, @PathVariable int num2){
        return num1 * num2;
    }

    @GetMapping(path = "/bool/{bool}")
    public String queryParamBoolean(@PathVariable boolean bool){
        System.out.println(bool);
        return String.valueOf(bool);
    }

    @DeleteMapping(path={"/user/{userName}/delete","/user/{userName}/del"})
    public void delete(@PathVariable String userName){
        log.info(userName);
    }



}
