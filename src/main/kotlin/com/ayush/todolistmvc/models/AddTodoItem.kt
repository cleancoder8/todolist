package com.ayush.todolistmvc.models

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class AddTodoItem(
        val name: String,
        val desc: String?
)