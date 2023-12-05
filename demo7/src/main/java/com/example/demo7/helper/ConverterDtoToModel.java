package com.example.demo7.helper;

import com.example.demo7.entity.Student;
import com.example.demo7.entitydto.Studentdto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ConverterDtoToModel {
    public  Student dtoToModel(Studentdto studentdto)
    {
        Student student=new Student();
        student.setId(studentdto.getId());
        student.setName(studentdto.getName());
        student.setPhoneNumber(studentdto.getPhoneNumber());
        student.setEmail(studentdto.getEmail());
        return student;
    }
    public  List<Student> dtoToModels(List<Studentdto> studentdtoList)
    {
        List<Student> students=new ArrayList<>();
        for(Studentdto studentdto:studentdtoList)
        {
            Student student=new Student();
            student.setId(studentdto.getId());
            student.setName(studentdto.getName());
            student.setEmail(studentdto.getEmail());
            student.setPhoneNumber(studentdto.getPhoneNumber());
            students.add(student);
        }
        return students;
    }
    public  List<Studentdto> ModelsTodto(List<Student> students)
    {
        List<Studentdto> studentdtoList=new ArrayList<>();
        for(Student student:students)
        {
            Studentdto studentdto=new Studentdto();
            studentdto.setId(student.getId());
            studentdto.setName(student.getName());
            studentdto.setEmail(student.getEmail());
            studentdto.setPhoneNumber(student.getPhoneNumber());
            studentdtoList.add(studentdto);
        }
        return studentdtoList;
    }
    public  Studentdto modelTodto(Student student)
    {
        Studentdto studentdto=new Studentdto();
        studentdto.setId(student.getId());
        studentdto.setName(student.getName());
        studentdto.setEmail(student.getEmail());
        studentdto.setPhoneNumber(student.getPhoneNumber());
        return studentdto;
    }
}
