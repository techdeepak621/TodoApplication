package com.todolist.ToDoListApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolist.ToDoListApp.model.Todo;

/**
 * @author deepak.mohapatra
 *
 */
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
