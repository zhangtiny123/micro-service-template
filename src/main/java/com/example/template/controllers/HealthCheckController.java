package com.example.template.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthCheckController
{
    @RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
    public ResponseEntity<String> checkApi()
    {
        return new ResponseEntity<>("Apis are available!", HttpStatus.OK);
    }
}
