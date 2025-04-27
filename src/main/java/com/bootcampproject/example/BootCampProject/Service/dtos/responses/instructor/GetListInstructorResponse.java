package com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor;

public class GetListInstructorResponse {

    private int id;
    private String name;

    public GetListInstructorResponse(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public GetListInstructorResponse() {

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
