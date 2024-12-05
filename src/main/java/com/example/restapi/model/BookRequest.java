package com.example.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {
    private String name;

    private String number;

    private String category;

    //lombok 적용이 제대로 되지 않은 거 같아 따로 생성함
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "BookRequest{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
