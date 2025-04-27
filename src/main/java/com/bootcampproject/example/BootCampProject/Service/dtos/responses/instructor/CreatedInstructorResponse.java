package com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor;

public class CreatedInstructorResponse {
    private  int id ;
    private  String name ;

    public CreatedInstructorResponse(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public CreatedInstructorResponse() {

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
