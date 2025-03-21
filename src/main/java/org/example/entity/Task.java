package org.example.entity;

import java.util.Objects;

public class Task {
    private String project;
    private String description;
    private String assignee;
    private Priority priority;
    private Status status;

    @Override
    public int hashCode() {
        return Objects.hash(project, description);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        Task task = (Task) obj;
        return Objects.equals(project, task.project) &&
                Objects.equals(description, task.description);
    }

    public Task(String project, String description, String assignee, Status status, Priority priority) {
        this.project = project;
        this.description = description;
        this.priority = priority;
        this.assignee = assignee;
        this.status = status;
    }

    public String getProject() {
        return project;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        return assignee;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }
}