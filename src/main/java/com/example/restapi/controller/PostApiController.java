package com.example.restapi.controller;

import com.example.restapi.model.BookRequest;
import com.example.restapi.model.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public String post(@RequestBody BookRequest bookRequest) {
        //@RequestBody post, put 방식에서 http body로 들어오는 데이터를 해당 객체에 매핑하겠다 / json, html
        System.out.println(bookRequest);
        return bookRequest.toString();
    }


    // TODO 이름, 전화번호, 이메일 받는 메서드
    @PostMapping("/user")
    public UserRequest getUser(@RequestBody UserRequest userRequest) {
        System.out.println(userRequest);
        return userRequest;
    }

}
