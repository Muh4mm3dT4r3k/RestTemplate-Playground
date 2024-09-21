package com.mohamed.resttemplate.client;

import com.mohamed.resttemplate.dto.ObjectDTO;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientService {
    private final RestTemplate restTemplate;
    private final static String GET = "http://localhost:8080/api/get";
    private final static String GET_OBJECT = "http://localhost:8080/api/get/{id}";
    public ClientService(RestTemplateBuilder builder) {
        this.restTemplate = builder
                .build();
    }

    public ResponseEntity<String> getMethod() {
        return restTemplate.getForEntity(GET, String.class);
    }

    public ObjectDTO getObject(int id) {
        return restTemplate.getForObject(GET_OBJECT, ObjectDTO.class, id);
    }

    public HttpHeaders retrieveHttpHeaders() {
        return restTemplate.headForHeaders(GET);
    }
}
