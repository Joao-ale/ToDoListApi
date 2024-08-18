package br.com.todoList.TodoList.service

import br.com.todoList.TodoList.dto.TaskView
import br.com.todoList.TodoList.enums.Errors
import br.com.todoList.TodoList.exception.NotFoundException
import br.com.todoList.TodoList.mapper.TaskViewMapper
import br.com.todoList.TodoList.model.Task
import br.com.todoList.TodoList.repository.TaskRepository
import org.springframework.data.jpa.domain.AbstractPersistable_
import org.springframework.stereotype.Service

@Service
class TaskService(
    private val taskRepository: TaskRepository,
    private val userService: UserService,
    private val taskViewMapper: TaskViewMapper
) {
    fun getTasks(): List<TaskView>{
        val tasks = taskRepository.findAll()
        val tasksView: List<TaskView> = ArrayList()

        tasks.forEach{ task ->
            tasksView.plus(taskViewMapper.map(task, userService))
        }

        return tasksView
    }

    fun getTaskById(id: Long): TaskView{
        val task = taskRepository.findById(id).orElseThrow{
            NotFoundException(
                Errors.TL601.message.format(id),
                Errors.TL601.code
            )
        }

        return taskViewMapper.map(task, userService)
    }
}