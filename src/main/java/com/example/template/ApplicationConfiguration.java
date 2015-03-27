package com.example.template;

import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration
{
    @Bean
    EmbeddedServletContainerCustomizer containerCustomizer(
            @Value("${server.port}") final int serverPort) throws Exception
    {
        return new EmbeddedServletContainerCustomizer()
        {
            @Override
            public void customize(ConfigurableEmbeddedServletContainer container)
            {
                TomcatEmbeddedServletContainerFactory tomcat = (TomcatEmbeddedServletContainerFactory) container;
                Connector connector = new Connector();
                connector.setPort(serverPort);
                connector.setSecure(true);
                tomcat.addAdditionalTomcatConnectors(connector);
            }
        };
    }
}
