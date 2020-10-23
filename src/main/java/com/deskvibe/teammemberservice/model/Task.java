package com.deskvibe.teammemberservice.model;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Task")
public class Task {

    @Id
    private int id;
    private String taskName;
    private String estimatedTime;
    private String timeTaken;
    private Boolean completionStatus;

    public Task() {
    }

    public Task(String taskName, String estimatedTime, String timeTaken, Boolean completionStatus) {
        this.taskName = taskName;
        this.estimatedTime = estimatedTime;
        this.timeTaken = timeTaken;
        this.completionStatus = completionStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(String estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(String timeTaken) {
        this.timeTaken = timeTaken;
    }

    public Boolean getCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(Boolean completionStatus) {
        this.completionStatus = completionStatus;
    }
}
