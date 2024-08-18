package br.com.todoList.TodoList.mapper

import br.com.todoList.TodoList.dto.TaskView
import br.com.todoList.TodoList.model.Task
import br.com.todoList.TodoList.service.UserService

class TaskViewMapper{
    fun map(t: Task, userService: UserService): TaskView {
        return TaskView(
            name = t.name,
            description = t.description,
            user = userService.getUserById(t.userId)
        )
    }
}