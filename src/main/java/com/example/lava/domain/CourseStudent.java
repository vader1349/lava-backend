package com.example.lava.domain;

public class CourseStudent {
    private int studentId;
    private int courseId;
    private int courseStudentId;
    private int status;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseStudentId() {
        return courseStudentId;
    }

    public void setCourseStudentId(int courseStudentId) {
        this.courseStudentId = courseStudentId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
