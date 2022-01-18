package com.example.springprojectblogwk9task.dto;

import lombok.Data;

import javax.persistence.Table;

@Table
@Data
public class LogInDTO {
    private String email;
    private String password;
}
