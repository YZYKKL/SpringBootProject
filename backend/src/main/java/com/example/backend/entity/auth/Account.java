package com.example.backend.entity.auth;

import lombok.Data;

@Data
public class Account {
    int id;
    String email;
    String username;
    String password;
}
