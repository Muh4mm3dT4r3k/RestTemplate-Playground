package com.mohamed.resttemplate.dto;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;

public record RequestDTO(
        String responseBody,
        HttpStatusCode httpStatusCode,
        HttpHeaders headers
){}