package com.example.restapi.controller;

import com.example.restapi.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class ResponseApiController {

    @GetMapping("")
    //@ResponseBody - @Controller
    //@RequestMapping(path="", method = RequestMethod.GET)
    public ResponseEntity<UserRequest> user(){
        var user = new UserRequest();
        user.setUserName("홍길동");
        user.setAge(10);
        user.setEmail("dd@gmail.com");

        log.info("user: {}", user);

        var response = ResponseEntity
                .status(HttpStatus.OK)
                .header("x-custom","hi")
                .body(user);

        return response;

        //UserRequest - returen user
    }
}
