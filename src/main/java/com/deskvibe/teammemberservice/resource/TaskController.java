package com.deskvibe.teammemberservice.resource;

import com.deskvibe.teammemberservice.model.Task;
import com.deskvibe.teammemberservice.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TaskController {

    @Autowired
    private TaskRepository repository;


    @PostMapping("/addTask")
    public String saveTask(@RequestBody Task task) {
        repository.save(task);
        return "Added task with id : " + task.getId();
    }

    @GetMapping("/findAllTasks")
    public List<Task> getTasks() {
        return repository.findAll();
    }

    @GetMapping("/findAllTasks/{id}")
    public Optional<Task> getTask(@PathVariable int id) {
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable int id) {
        repository.deleteById(id);
        return "task deleted with id : " + id;
    }

}
