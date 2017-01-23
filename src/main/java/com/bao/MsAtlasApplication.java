package com.bao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.metrics.atlas.EnableAtlas;

@EnableAtlas
@SpringBootApplication
public class MsAtlasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAtlasApplication.class, args);
	}
}
