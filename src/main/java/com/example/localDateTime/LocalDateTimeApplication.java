package com.example.localDateTime;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class LocalDateTimeApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(LocalDateTimeApplication.class, args);
		Example example = new Example();
		example.setTime(LocalDateTime.now());
		ObjectMapper om = new ObjectMapper();
		om.registerModule(new JavaTimeModule()).configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		String str = om.writeValueAsString(example.getTime());
		System.out.println(str);
	}

}
