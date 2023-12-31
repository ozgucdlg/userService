package com.pratik2.user;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
	
	@Bean
	public ModelMapper getModelMapper() {
		
		return new ModelMapper();
	}
	
	@Configuration
	public class CorsConfig implements WebMvcConfigurer {

	    @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	            .allowedOrigins("*")
	            .allowedMethods("*");
	    }
	}


	

}
