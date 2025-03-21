package org.example.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public Set<Task> getTasks(String name) {
        return name.equals("ann") ?
                annsTasks : name.equals("bob") ?
                bobsTasks : name.equals("carol") ?
                carolsTasks : unassignedTasks;
    }

    public Set<Task> getUnion(Set<Task> tasks1, Set<Task> tasks2) {
        tasks1.addAll(tasks2);
        return tasks1;
    }

    public Set<Task> getIntersection(Set<Task> tasks1, Set<Task> tasks2) {
        Set<Task> intersect = new HashSet<>(tasks1);
        intersect.retainAll(tasks2);
        return intersect;
    }

    public Set<Task> getDifferences(Set<Task> tasks1, Set<Task> tasks2) {
        tasks1.removeAll(tasks2);
        return tasks1;
    }

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> unassignedTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.unassignedTasks = unassignedTasks;
        this.carolsTasks = carolsTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }
}