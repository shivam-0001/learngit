package com.example.demo7.controller;

import com.example.demo7.Exception.CustomException;
import com.example.demo7.entity.Student;
import com.example.demo7.entitydto.Studentdto;
import com.example.demo7.service.StudentService;
import com.example.demo7.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RequestMapping("/studentApplication")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addStudent")
    @ResponseStatus( HttpStatus.CREATED )
    public Studentdto addStudent(@Valid @RequestBody Studentdto studentdto)
    {
        studentdto= studentService.saveStudent(studentdto);
        return studentdto;
    }
    @PostMapping("/addStudents")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Studentdto> addStudents(@Valid @RequestBody List<Studentdto> students)
    {
        return studentService.saveStudents(students);
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/students")
    public List<Studentdto> findAllStudents()
    {
        return studentService.getStudents();
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/student/{id}")
    public Studentdto findStudentById(@PathVariable int id)
    {
        return
                studentService.getStudentsById(id);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/update")
    public Studentdto updateStudent(@Valid @RequestBody Studentdto studentdto)
    {
        return studentService.updateStudent(studentdto);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id)
    {
        return studentService.deleteStudent(id);
    }
}
