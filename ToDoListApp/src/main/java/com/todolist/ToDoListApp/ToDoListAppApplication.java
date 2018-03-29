package com.todolist.ToDoListApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author deepak.mohapatra
 *
 */
@SpringBootApplication
@EnableJpaRepositories

public class ToDoListAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListAppApplication.class, args);
	}
}
