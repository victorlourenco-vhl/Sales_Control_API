package com.tgid.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tgid.spring.services.S3Service;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private S3Service s3Service;
	
	public static void main(String [] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {	
		s3Service.uploadFile("C:\\temp\\fotos\\foto.jpg");
	}
	

}
