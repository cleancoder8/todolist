package com.ayush.todolistmvc.services

import com.ayush.todolistmvc.models.AddTodoItem
import com.ayush.todolistmvc.models.TodoItemDTO
import com.ayush.todolistmvc.repository.TodoListDAO
import org.springframework.stereotype.Service
import java.util.*

@Service
class TodoListService(val todoListDAO: TodoListDAO) {


    fun getAllTasks(): List<TodoItemDTO> {

        return todoListDAO.findAll()

    }

    fun getTask(id: String): TodoItemDTO? {

        val res = todoListDAO.findById(id)

        return if (res.isPresent)
            res.get()
        else
            null
    }

    fun addTask(addTodoItem: AddTodoItem) {

        val itemDTO = TodoItemDTO(taskId = UUID.randomUUID().toString(),
                taskName = addTodoItem.name,
                taskDesc = addTodoItem.desc, completed = "false")

        todoListDAO.insert(itemDTO)
    }

    fun deleteTask(id: String) {

        val findItemDTO = getTask(id)

        if (findItemDTO != null)
            todoListDAO.delete(findItemDTO)
    }

    fun finishTask(id: String) {

        val findItemDTO = getTask(id)

        if (findItemDTO != null) {

            val completeTask = findItemDTO.copy(completed = "true")
            todoListDAO.insert(completeTask)
        }


    }

}