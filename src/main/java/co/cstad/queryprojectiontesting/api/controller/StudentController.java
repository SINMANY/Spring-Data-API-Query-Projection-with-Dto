package co.cstad.queryprojectiontesting.api.controller;

import co.cstad.queryprojectiontesting.api.repository.StudentRepository;
import co.cstad.queryprojectiontesting.api.web.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/students")
public class StudentController {
    private final StudentRepository studentRepository;

    @GetMapping("/{username}")
    public List<StudentDto> findStudentByUsername(@PathVariable String username){
        return studentRepository.findByUsername(username);
    }
}
