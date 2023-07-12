package com.example.kursovayatest.service;


import com.example.kursovayatest.model.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String text, String answer);
    Question add(Question question);
    Question remove(String text, String answer);
    Question remove(Question question);
    Collection<Question> getAll();
    Question getRandomQuestion();
}
