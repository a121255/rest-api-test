package com.example.restapi.controller;

import com.example.restapi.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public void put(@RequestBody UserRequest userRequest) {
        log.info(String.valueOf(userRequest));
        //sout과 다른 점 : 속도저하, 로그백은 자체적으로 버퍼 있음, 버퍼사이즈도 설정 가능, 포맷 바꿀 수 있음
        // PUT : 없으면 추가, 이미 있다면 갱신

    }
}
