package com.example.kursovayatest.service;


import com.example.kursovayatest.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
