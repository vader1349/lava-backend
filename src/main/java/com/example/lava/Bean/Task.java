package com.example.lava.Bean;

public class Task {
    private int task_id;
    private int course_id;
    private int percentage;
    private int full_score;
    private String description;

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public int getFull_score() {
        return full_score;
    }

    public void setFull_score(int full_score) {
        this.full_score = full_score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
