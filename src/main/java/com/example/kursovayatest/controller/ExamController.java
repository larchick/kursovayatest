package com.example.kursovayatest.controller;


import com.example.kursovayatest.model.Question;
import com.example.kursovayatest.service.ExaminerService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {

    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService){
        this.examinerService = examinerService;
    }
    @GetMapping("/get/{amount}")
    public Collection<Question> getQuestion(@PathVariable int amount){
        return examinerService.getQuestions(amount);
    }
}
