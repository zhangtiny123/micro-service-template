package com.example.template.controllers;

import com.example.template.services.DependenciesProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class Diagnostics
{
    @Autowired
    private DependenciesProvider dependenciesProvider;
    
    @RequestMapping(value = "/dependencies", method = RequestMethod.GET)
    public ResponseEntity<List<String>> diagnoseDependencies() {
        return new ResponseEntity<List<String>>(dependenciesProvider.getDependenciesList(), HttpStatus.OK);
    }
}
