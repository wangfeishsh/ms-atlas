package com.bao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.metrics.atlas.EnableAtlas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAtlas
@SpringBootApplication
@RestController
public class MsAtlasApplication {

	@GetMapping("/test")
	public String test(){
		return "test";
	}

	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(MsAtlasApplication.class, args);
	}
}
