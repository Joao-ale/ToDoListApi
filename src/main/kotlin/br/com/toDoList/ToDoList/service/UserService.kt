package br.com.todoList.TodoList.service

import br.com.todoList.TodoList.enums.Errors
import br.com.todoList.TodoList.exception.NotFoundException
import br.com.todoList.TodoList.repository.UserRepository
import com.joao.TodoList.model.User

class UserService(
    private val userRepository: UserRepository
) {
    fun getUsers():List<User>{
        return userRepository.findAll()
    }

    fun getUserById(id: Long): User {
        val user = userRepository.findById(id).orElseThrow{
            NotFoundException(
                Errors.TL701.message.format(id),
                Errors.TL701.code
            )
        }
        return user
    }
}