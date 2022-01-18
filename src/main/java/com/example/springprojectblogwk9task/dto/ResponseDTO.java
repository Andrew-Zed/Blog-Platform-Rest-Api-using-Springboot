package com.example.springprojectblogwk9task.dto;

import com.example.springprojectblogwk9task.entity.Users;
import lombok.Data;

@Data
public class ResponseDTO {
    private String message;
    private Users data;
    private boolean status;
}
