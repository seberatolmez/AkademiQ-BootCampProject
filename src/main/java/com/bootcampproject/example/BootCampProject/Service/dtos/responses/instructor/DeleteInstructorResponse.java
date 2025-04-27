package com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor;

public class DeleteInstructorResponse {
    private  int id;
    private String name;

    public DeleteInstructorResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public DeleteInstructorResponse() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
