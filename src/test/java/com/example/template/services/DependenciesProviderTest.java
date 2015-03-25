package com.example.template.services;

import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Component
public class DependenciesProviderTest
{
    private DependenciesProvider dependenciesProvider;
    private List<String> dependencies;

    @Before
    public void setUp() throws Exception
    {
        dependenciesProvider = new DependenciesProvider();
        dependencies = dependenciesProvider.getDependenciesList();
    }

    @Test
    public void should_get_dependencies_list_and_its_length_is_3()
    {
        assertThat(dependencies.size(), is(3));
    }

    @Test
    public void should_()
    {
        assertThat(dependencies.contains("AddressService"), is(true));
    }
}