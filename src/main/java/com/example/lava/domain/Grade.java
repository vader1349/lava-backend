package com.example.lava.domain;

public class Grade {
    private int taskId;
    private int courseStudentId;
    private int score;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getCourseStudentId() {
        return courseStudentId;
    }

    public void setCourseStudentId(int courseStudentId) {
        this.courseStudentId = courseStudentId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
