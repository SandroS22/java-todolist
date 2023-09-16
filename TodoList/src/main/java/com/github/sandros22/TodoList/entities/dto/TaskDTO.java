package com.github.sandros22.TodoList.entities.dto;

import jakarta.validation.constraints.NotBlank;

public record TaskDTO(@NotBlank String title,@NotBlank  String description) {

}
