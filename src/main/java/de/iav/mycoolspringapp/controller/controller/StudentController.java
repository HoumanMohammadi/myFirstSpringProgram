package de.iav.mycoolspringapp.controller.controller;

import de.iav.mycoolspringapp.controller.model.Student;
import de.iav.mycoolspringapp.controller.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;


    public StudentController( StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping

    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping
    public void addStudent(@RequestBody Student studentToAdd) {
        studentService.addStudent(studentToAdd);
    }

    @GetMapping("/{id}")
    public Student getStudentByID(@PathVariable String id){
        return studentService.getStudentByID(id);
    }
}
