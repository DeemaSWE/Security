package com.example.security.Api;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiException extends RuntimeException{

    private String message;
}
