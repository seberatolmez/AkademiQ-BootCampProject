package com.bootcampproject.example.BootCampProject.Service.abstracts;

import com.bootcampproject.example.BootCampProject.Service.dtos.requests.instructor.CreateInstructorRequest;
import com.bootcampproject.example.BootCampProject.Service.dtos.requests.instructor.UpdateInstructorRequest;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor.CreatedInstructorResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor.GetInstructorResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor.GetListInstructorResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor.UpdatedInstructorResponse;

import java.util.List;

public interface IInstructorService {

    CreatedInstructorResponse addInstructor(CreateInstructorRequest request);// add
    UpdatedInstructorResponse updateInstructor(UpdateInstructorRequest request); // update
    GetInstructorResponse getInstructor(int id);
    List<GetListInstructorResponse> getAllInstructors();
    void deleteInstructor(int id);

}
