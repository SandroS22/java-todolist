package com.github.sandros22.TodoList.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.sandros22.TodoList.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {

}
