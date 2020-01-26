package com.ayush.todolistmvc.models

import com.fasterxml.jackson.annotation.JsonInclude
import javax.validation.constraints.NotNull

@JsonInclude(JsonInclude.Include.NON_NULL)
data class AddTodoItem(
        @NotNull(message = "Name can't be null")
        val name: String,
        val desc: String?
)