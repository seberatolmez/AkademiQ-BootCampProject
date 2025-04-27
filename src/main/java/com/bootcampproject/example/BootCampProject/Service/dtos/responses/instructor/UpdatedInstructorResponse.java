package com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor;

public class UpdatedInstructorResponse {

    private int id;
    private String name;

    public UpdatedInstructorResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public UpdatedInstructorResponse() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
