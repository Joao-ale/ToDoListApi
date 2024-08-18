package br.com.todoList.TodoList.dto

import com.joao.TodoList.model.User
import org.springframework.stereotype.Component

@Component
data class TaskView(
    val name: String,
    val description: String,
    val user: User
)