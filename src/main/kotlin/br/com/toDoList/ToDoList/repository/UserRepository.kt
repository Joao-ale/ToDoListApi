package br.com.todoList.TodoList.repository

import com.joao.TodoList.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User,Long> {
}