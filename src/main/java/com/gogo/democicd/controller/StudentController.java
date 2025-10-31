package com.gogo.democicd.controller;


import com.gogo.democicd.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        // Créer une liste dynamique d'étudiants
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Dupont", "Jean"));
        students.add(new Student(2, "Martin", "Claire"));
        students.add(new Student(3, "Nguyen", "Anh"));

        return students;
    }
}

