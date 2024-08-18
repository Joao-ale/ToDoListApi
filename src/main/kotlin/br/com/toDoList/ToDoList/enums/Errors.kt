package br.com.todoList.TodoList.enums

enum class Errors(val code: String, val message: String) {
    //br.com.todoList.TodoList.model.Task 600 - 700
    TL601("TL-601", "br.com.todoList.TodoList.model.Task [%] not found"),

    //br.com.toDoList.ToDoLis.model.User 701 - 800
    TL701("TL-701", "br.com.toDoList.ToDoList.model.User [%] not found")
}