package com.example.template;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Application
{

    @RequestMapping("/")
    @ResponseBody
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping(value = "/appCheck", method = RequestMethod.GET)
    public ResponseEntity<String> helloWorld() {

        return new ResponseEntity<String>("Hello world!", HttpStatus.OK);
    }
}