package com.example.demo7.service;
import com.example.demo7.Exception.CustomException;
import com.example.demo7.entity.Student;
import com.example.demo7.entitydto.Studentdto;
import com.example.demo7.helper.ConverterDtoToModel;
import com.example.demo7.repository.StudentRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ConverterDtoToModel converterDtoToModel;

    public Studentdto saveStudent(Studentdto studentdto)
    {
         Student student=converterDtoToModel.dtoToModel(studentdto);
        student= studentRepository.save(student);
        studentdto=converterDtoToModel.modelTodto(student);
        return studentdto;

    }
    public List<Studentdto> saveStudents(List<Studentdto> studentsdto)
    {
        List<Student> studentList= converterDtoToModel.dtoToModels(studentsdto);
        studentList= studentRepository.saveAll(studentList);
       studentsdto= converterDtoToModel.ModelsTodto(studentList);
       return studentsdto;
    }
    public List<Studentdto> getStudents() {
        List<Student> students = studentRepository.findAll();
        if (students.isEmpty()) {
            throw new CustomException("empty record");
        } else {
            List<Studentdto> studentdtoList = converterDtoToModel.ModelsTodto(students);
            return studentdtoList;
        }
    }
    public Studentdto getStudentsById(int id)
    {

       Student student= studentRepository.findById(id).orElseThrow( ()-> new CustomException("student not found for this id :: " + id));
            Studentdto studentdto= converterDtoToModel.modelTodto(student);
       return studentdto;
    }
    public String deleteStudent(int id)
    {
        // studentRepository.deleteById(id);
        Optional<Student> studentOptional = studentRepository.findById(id);

        if (studentOptional.isPresent()) {
            studentRepository.deleteById(id);
            return "Student removed";
        } else {
            throw new CustomException("Student with ID " + id + " not found");
        }


    }
    public Studentdto updateStudent(Studentdto studentdto)
    {
           Student student=converterDtoToModel.dtoToModel(studentdto);
           Student existingStudent=studentRepository.findById(student.getId()).orElseThrow(()->new ResourceNotFoundException("student not found for this id"+student.getId()));
           existingStudent.setName(student.getName());
           existingStudent.setEmail(student.getEmail());
           existingStudent.setPhoneNumber(student.getPhoneNumber());
           Student student1=studentRepository.save(existingStudent);
           Studentdto studentdto1=converterDtoToModel.modelTodto(student1);
           return studentdto1;
    }
}
