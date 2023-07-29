package com.restfulproject.toyboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class ToyboardApplication {

	public static void main(String[] args) {

		
		SpringApplication.run(ToyboardApplication.class, args);

		String springBootVersion = SpringApplication.class.getPackage().getImplementationVersion();
        System.out.println("Spring Boot version: " + springBootVersion);

        String springVersion = SpringVersion.getVersion();
        System.out.println("Spring version: " + springVersion);

        String jvmVersion = System.getProperty("java.version");
        System.out.println("JVM version: " + jvmVersion);

	}

}
