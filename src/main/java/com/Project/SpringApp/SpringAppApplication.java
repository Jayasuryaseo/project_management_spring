package com.Project.SpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.Project.SpringApp.*" })
@EnableJpaRepositories("com.Project.SpringApp.*")
@EntityScan("com.Project.SpringApp.*")
@EnableAutoConfiguration
//@EnableSwagger2
//@EnableWebSecurity
//@EnableScheduling
//@EnableRetry
//@EnableCaching
//@EnableAsync
//@Import(EndpointAutoConfiguration.class)
//@EnableEncryptableProperties
public class SpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

}
