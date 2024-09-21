package com.mohamed.resttemplate.client;

import com.mohamed.resttemplate.dto.ObjectDTO;
import com.mohamed.resttemplate.dto.RequestDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/get")
    public String get() {
        ResponseEntity<String> response = clientService.getMethod();
        RequestDTO requestDTO = new RequestDTO(
                response.getBody(),
                response.getStatusCode(),
                response.getHeaders());
        System.out.println(requestDTO);
        return requestDTO.responseBody();
    }

    @GetMapping("/get/object")
    public ObjectDTO getObject() {
        return clientService
                .getObject(1);
    }

    @GetMapping("/retrieve/headers")
    public ResponseEntity<HttpHeaders> retrieveHeaders() {
        return ResponseEntity.ok(clientService.retrieveHttpHeaders());
    }

}
