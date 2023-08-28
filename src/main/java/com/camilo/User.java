package com.camilo;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@Getter
public class User {

    private String id;
    private String username;
    private String password;
    private int age;

}
