package com.example.kursovayatest.service.impl;

import com.example.kursovayatest.exeption.NoteEnoughQuestionsInStorage;
import com.example.kursovayatest.model.Question;
import com.example.kursovayatest.service.ExaminerService;
import com.example.kursovayatest.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.getAll().size()){
            throw new NoteEnoughQuestionsInStorage();
        }

        Set<Question> randomQuestion = new HashSet<>();

        while (randomQuestion.size() < amount){
            randomQuestion.add(questionService.getRandomQuestion());
        }

        return randomQuestion;
    }

}
