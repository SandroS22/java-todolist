package com.github.sandros22.TodoList.entities.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@SuppressWarnings("unused")
public class Task {

	@Id
	private UUID id;

	private String title;

	private String description;

	public Task(String title, String description) {
		this.title = title;
		this.description = description;
	}

}
