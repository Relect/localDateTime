package com.example.localDateTime;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

@SpringBootApplication
public class LocalDateTimeApplication {

	public static void main(String[] args) throws JsonProcessingException {
		ApplicationContext context = SpringApplication.run(LocalDateTimeApplication.class, args);
		ObjectMapper mapper = context.getBean(ObjectMapper.class);

		Example example = new Example();
		LocalDateTime time = LocalDateTime.now(ZoneOffset.of("+4"));
		example.setTime(time);
		example.setTime2(time);
		String str = mapper.writeValueAsString(example);
		System.out.println(str);
	}

}
