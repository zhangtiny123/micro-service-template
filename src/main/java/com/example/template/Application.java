package com.example.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Application
{

    @RequestMapping("/")
    @ResponseBody
    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping(value = "/appCheck", method = RequestMethod.GET)
    public ResponseEntity<String> helloWorld()
    {

        return new ResponseEntity<String>("Hello world!", HttpStatus.OK);
    }
}