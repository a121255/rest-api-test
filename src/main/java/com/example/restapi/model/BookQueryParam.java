package com.example.restapi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookQueryParam {

    String category;
    String issuedYear;
    String issuedMonth;
    String issuedDay;

    public String getCategory() {
        return category;
    }
}
