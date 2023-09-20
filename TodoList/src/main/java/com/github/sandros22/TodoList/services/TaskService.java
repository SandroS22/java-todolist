package com.github.sandros22.TodoList.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.sandros22.TodoList.entities.model.Task;
import com.github.sandros22.TodoList.repositories.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public Iterable<Task> findAll() {
		return taskRepository.findAll();

	}

	public void save(Task newTask) {
		taskRepository.save(newTask);
	}

	public Optional<Task> findById(UUID id) {
		return taskRepository.findById(id);
	}

	public Task delete(Task task) {
		taskRepository.delete(task);
		return task;
	}

}
