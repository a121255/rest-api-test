package com.example.restapi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value= PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserRequest {
    private String userName;    //json 요청을 user_name으로 보내야함
    private int age;

    /*@JsonProperty("EMAIL")*/
    private String email;
    private Boolean isKorean;

    @JsonIgnore
    public String getUser(){
        return userName;
    }

}
