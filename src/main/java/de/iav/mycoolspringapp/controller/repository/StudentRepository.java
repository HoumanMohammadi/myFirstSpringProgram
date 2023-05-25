package de.iav.mycoolspringapp.controller.repository;
import de.iav.mycoolspringapp.controller.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.NoSuchElementException;

@Repository
public class StudentRepository {

    private final List<Student> students;

    public StudentRepository(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents(){
        return students;
    }

    public Student getStudentByID(String id){
        for (Student student : students){
            if (student.getId().equals(id)){
                return student;
            }
        }
        throw new NoSuchElementException("Student not found!");
    }

    public void addStudent(Student studentToAdd){
        students.add(studentToAdd);
    }

}
