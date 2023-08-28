package com.camilo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@Getter
@AllArgsConstructor
public class User implements Comparable<User> {
    private String id;
    private String username;
    private String password;
    private int age;

    @Override
    public String toString() {
        return username;
    }

    @Override
    public int compareTo(User o) {
        return username.compareTo(o.getUsername());
    }
}
