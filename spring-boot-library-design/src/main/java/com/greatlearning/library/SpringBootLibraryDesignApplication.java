package com.greatlearning.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.library.entity.Library;
import com.greatlearning.library.model.GreatLearning;
import com.greatlearning.library.serviceImpl.LibraryReadServiceImpl;

@SpringBootApplication
public class SpringBootLibraryDesignApplication implements CommandLineRunner {
	
	@Autowired
	LibraryReadServiceImpl libraryReadServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);

		System.out.println("Hi Spring Boot");
		System.out.println("Hi Dev-Tool");
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Library> libraries = libraryReadServiceImpl.getAllLibrary();
		
		
	}

}
