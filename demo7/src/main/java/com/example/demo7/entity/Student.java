package com.example.demo7.entity;
import lombok.*;
import org.springframework.validation.annotation.Validated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Student {
    @Id
    @GeneratedValue
    private int id;

    @NotEmpty
    @Size(min = 2, message = "First Name should have atleast 2 characters")

    @Pattern(regexp ="^[A-Za-z\\s]+$" ,message = "name not contain special symbol and numbers")
    private String name;

    @NotNull
    private int phoneNumber;

    @Email
    @NotNull
    private String email;

}
