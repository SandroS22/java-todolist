package com.github.sandros22.TodoList.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Task {

	@Id
	private UUID id;

	@SuppressWarnings("unused")
	private String title;

	@SuppressWarnings("unused")
	private String description;

}
