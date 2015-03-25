package com.example.template.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DependenciesProvider
{
    public List<String> getDependenciesList(){
        List<String> dependencies = new ArrayList<String>();
        dependencies.add("OccupationService");
        dependencies.add("AddressService");
        dependencies.add("ScienceService");
    
        return dependencies;
    }
}
