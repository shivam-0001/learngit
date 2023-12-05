package com.example.demo7.entitydto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Studentdto {
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
