package com.github.sandros22.TodoList.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.sandros22.TodoList.entities.dto.TaskDTO;
import com.github.sandros22.TodoList.entities.model.Task;
import com.github.sandros22.TodoList.services.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@GetMapping
	public Iterable<Task> getAllTask() {
		return taskService.findAll();
	}

	@PostMapping
	public @ResponseBody Task createTask(@RequestParam(name = "title") String title,
			@RequestParam(name = "description") String desc) {
		TaskDTO newTaskDTO = new TaskDTO(title, desc);
		Task newTask = new Task();
		BeanUtils.copyProperties(newTaskDTO, newTask);
		taskService.save(newTask);
		return newTask;

	}

	@DeleteMapping
	public @ResponseBody Object deleteTask(@RequestParam(name = "id") UUID id) {
		Optional<Task> task = taskService.findById(id);
		if (task.isEmpty()) {
			return HttpStatusCode.valueOf(404);
		} else {
			return taskService.delete(task.get());
		}
	}

}
