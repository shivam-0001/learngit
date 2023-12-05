package com.example.demo7.service;

import com.example.demo7.entity.Student;
import com.example.demo7.entitydto.Studentdto;

import java.util.List;

public interface StudentService {
public Studentdto saveStudent(Studentdto studentdto);
    public List<Studentdto> saveStudents(List<Studentdto> students);
    public List<Studentdto> getStudents();
    public Studentdto getStudentsById(int id);
    public String deleteStudent(int id);
    public Studentdto updateStudent(Studentdto studentdto);
}
