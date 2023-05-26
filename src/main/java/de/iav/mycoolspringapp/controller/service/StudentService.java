package de.iav.mycoolspringapp.controller.service;

import de.iav.mycoolspringapp.controller.model.Student;
import de.iav.mycoolspringapp.controller.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents(){
        return studentRepository.getAllStudents();
    }

    public Student getStudentByID(String id){
        return studentRepository.getStudentByID(id);
    }

    public Student addStudent(Student student){
        studentRepository.addStudent(student);
        return student;
    }
}
