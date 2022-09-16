package com.example.sayehwebservices.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RoleTester {

    @CrossOrigin
    @GetMapping("/admin")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<Object> getAdmin() {
        return new ResponseEntity<>(
                "{ \"message\": \"the admin secret key is this\"}",getJsonHeader(), HttpStatus.OK
        );
    }

    @CrossOrigin
    @GetMapping("/user")
    @PreAuthorize("hasRole('user')")
    ResponseEntity<Object> getUser() {

        return new ResponseEntity<>(
                "{ \"message\": \"the user secret key is this\"}", getJsonHeader(), HttpStatus.OK
        );
    }

    private MultiValueMap<String, String> getJsonHeader() {
        MultiValueMap<String, String> jsonHeader = new HttpHeaders();
        jsonHeader.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        return jsonHeader;
    }
}
