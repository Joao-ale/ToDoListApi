package br.com.todoList.TodoList.model


import com.joao.TodoList.model.User
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import java.util.Date


@Entity
data class Task (
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    val id: Long? = null,

    @OneToOne
    @JoinColumn(name = "user_id")
    val userId: Long,
    val name: String,
    val description: String,
    val date: Date
)