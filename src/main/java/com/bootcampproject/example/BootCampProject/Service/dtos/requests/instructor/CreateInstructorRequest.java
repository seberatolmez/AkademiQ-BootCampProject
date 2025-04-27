package com.bootcampproject.example.BootCampProject.Service.dtos.requests.instructor;

public class CreateInstructorRequest {

    String name;

    public CreateInstructorRequest(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
