package com.cdi.com.AdministradorCDI;

import com.cdi.com.AdministradorCDI.Comun.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
@EnableConfigurationProperties({
    FileStorageProperties.class
})
@Configuration
@PropertySource("dev.properties")
@Profile("dev")

public class AdministradorCDIApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdministradorCDIApplication.class, args);
    }

}
