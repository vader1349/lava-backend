package com.example.lava.Bean;

public class Course {
    private int courseId;
    private int instructorId;
    private String code;
    private char format;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public char getFormat() {
        return format;
    }

    public void setFormat(char format) {
        this.format = format;
    }
}
