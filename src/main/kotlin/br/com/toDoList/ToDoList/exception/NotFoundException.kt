package br.com.todoList.TodoList.exception

class NotFoundException(override val message: String, val errorCode:String): Exception()