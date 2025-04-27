package com.bootcampproject.example.BootCampProject.Service.concrets;

import com.bootcampproject.example.BootCampProject.Entity.Instructor;
import com.bootcampproject.example.BootCampProject.Repository.InstructorRepository;
import com.bootcampproject.example.BootCampProject.Service.abstracts.IInstructorService;
import com.bootcampproject.example.BootCampProject.Service.dtos.requests.instructor.CreateInstructorRequest;
import com.bootcampproject.example.BootCampProject.Service.dtos.requests.instructor.UpdateInstructorRequest;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.applicant.GetApplicantResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor.CreatedInstructorResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor.GetInstructorResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor.GetListInstructorResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.instructor.UpdatedInstructorResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ImplInstructorService implements IInstructorService {
    private final InstructorRepository repository;

    public ImplInstructorService(InstructorRepository repository) {
        this.repository = repository;
    }

    @Override
    public CreatedInstructorResponse addInstructor(CreateInstructorRequest request) {
        Instructor instructor = new Instructor();
        instructor.setFirstName(request.getName());
        Instructor addedInstructor = repository.save(instructor);

        CreatedInstructorResponse response = new CreatedInstructorResponse();
        response.setId(addedInstructor.getId());
        response.setName(addedInstructor.getFirstName());

        return response;
    }

    @Override
    public UpdatedInstructorResponse updateInstructor(UpdateInstructorRequest request) {
        Instructor oldInstructor = repository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("instructor not found"));

        oldInstructor.setFirstName(request.getName());
        Instructor updatedInstructor = repository.save(oldInstructor);

        UpdatedInstructorResponse response = new UpdatedInstructorResponse();
        response.setId(updatedInstructor.getId());
        response.setName(updatedInstructor.getFirstName());

        return response;
    }

    @Override
    public GetInstructorResponse getInstructor(int id) {
        Instructor instructor = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("instructor not found"));
        return mapToInstructorResponse(instructor);
    }

    public GetInstructorResponse mapToInstructorResponse(Instructor instructor){
        GetInstructorResponse response = new GetInstructorResponse();
        response.setId(instructor.getId());
        response.setName(instructor.getFirstName());

        return response;
    }

    @Override
    public List<GetListInstructorResponse> getAllInstructors() {
        return  repository.findAll().stream()
                .map(this::mapToListResponse).collect(Collectors.toList());
    }

    public GetListInstructorResponse mapToListResponse(Instructor instructor){
        GetListInstructorResponse response = new GetListInstructorResponse();
        response.setId(instructor.getId());
        response.setName(instructor.getFirstName());

        return response;
    }



    @Override
    public void deleteInstructor(int id) {
      repository.deleteById(id);
    }
}
