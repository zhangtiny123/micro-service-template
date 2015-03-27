package com.example.template;

import com.example.template.controllers.BookController;
import com.example.template.services.BookService;
import com.example.template.services.DependenciesProvider;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@Configuration
public class ApplicationConfiguration
{
    @Bean
    EmbeddedServletContainerFactory containerFactory()
    {
        return new JettyEmbeddedServletContainerFactory(8081);
    }

    @Bean
    Logger logger()
    {
        return Logger.getLogger("book-logger");
    }

    @Bean
    FileHandler fileHandler() throws IOException
    {
        FileHandler fileHandler = new FileHandler("./src/main/resources/logs/my-log.log");
        fileHandler.setFormatter(new SimpleFormatter());
        return fileHandler;
    }

    @Bean
    BookService bookService(Logger logger, FileHandler fileHandler)
    {
        return new BookService(logger, fileHandler);
    }

    @Bean
    DependenciesProvider dependenciesProvider()
    {
        return new DependenciesProvider();
    }

    @Bean
    BookController bookController()
    {
        return new BookController();
    }
}
