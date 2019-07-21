package com.ayush.todolistmvc.repository

import com.ayush.todolistmvc.models.TodoItemDTO
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoListDAO : CassandraRepository<TodoItemDTO, String>