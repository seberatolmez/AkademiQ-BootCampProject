package com.bootcampproject.example.BootCampProject.Controller;

import com.bootcampproject.example.BootCampProject.Service.concrets.ImplInstructorService;
import com.bootcampproject.example.BootCampProject.Service.dtos.requests.instructor.CreateInstructorRequest;
import com.bootcampproject.example.BootCampProject.Service.dtos.requests.instructor.UpdateInstructorRequest;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor.CreatedInstructorResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor.GetInstructorResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor.GetListInstructorResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor.UpdatedInstructorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/instructors")
public class InstructorController {
    @Autowired
    private final ImplInstructorService service;

    public InstructorController(ImplInstructorService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedInstructorResponse createInstructor(@RequestBody CreateInstructorRequest request){
        return service.addInstructor(request);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public UpdatedInstructorResponse updateInstructor(@RequestBody UpdateInstructorRequest request){
        return service.updateInstructor(request);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GetInstructorResponse getInstructorById(@PathVariable int id){
        return service.getInstructor(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetListInstructorResponse> getAllInstructors() {
        return service.getAllInstructors();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteInstructor(@PathVariable int id){
        service.deleteInstructor(id);
    }
}

