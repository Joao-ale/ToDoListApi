package br.com.todoList.TodoList.repository

import br.com.todoList.TodoList.model.Task
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository:JpaRepository<Task,Long> {
}