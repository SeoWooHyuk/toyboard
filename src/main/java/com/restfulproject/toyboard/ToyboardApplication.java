package com.restfulproject.toyboard;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

@SpringBootApplication
public class ToyboardApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ToyboardApplication.class, args);

	}

	@Bean
	MappingJackson2JsonView jsonView()
	{
		return new MappingJackson2JsonView();
	}

}
