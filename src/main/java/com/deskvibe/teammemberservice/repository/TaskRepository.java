package com.deskvibe.teammemberservice.repository;

import com.deskvibe.teammemberservice.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, Integer> {
}
