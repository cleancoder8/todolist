package com.ayush.todolistmvc.controllers

import com.ayush.todolistmvc.models.AddTodoItem
import com.ayush.todolistmvc.models.TodoItemDTO
import com.ayush.todolistmvc.services.TodoListService
import org.springframework.web.bind.annotation.*


@RequestMapping("/todolist")
@RestController
class TodoListController(val todoListService: TodoListService) {


    @GetMapping("/view-all")
    fun getAllTasks(): List<TodoItemDTO> {

        return todoListService.getAllTasks()
    }

    @PostMapping("/add")
    fun addTask(@RequestBody addTodoItem: AddTodoItem) {
        todoListService.addTask(addTodoItem)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteTask(@PathVariable(value = "id") id: String) {

        todoListService.deleteTask(id)
    }

    @PostMapping("/finish/{id}")
    fun finishTask(@PathVariable(value = "id") id: String) {
        todoListService.finishTask(id)

    }

}