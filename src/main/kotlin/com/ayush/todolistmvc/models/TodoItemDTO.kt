package com.ayush.todolistmvc.models

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@Table("todolist")
@JsonInclude(JsonInclude.Include.NON_NULL)
data class TodoItemDTO(
        @PrimaryKey val taskId: String,

        @JsonProperty(value = "name")
        @Column val taskName: String,

        @JsonProperty(value = "description")
        @Column val taskDesc: String?,

        @Column val completed: String?
)
