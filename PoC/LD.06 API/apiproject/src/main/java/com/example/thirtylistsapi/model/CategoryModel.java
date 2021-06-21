package com.example.thirtylistsapi.model;

import com.example.thirtylistsapi.view.Views;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.servlet.View;

import java.util.ArrayList;
import java.util.List;


public class CategoryModel implements Model {

    private  final String id;
    private  final String name;
    private  final List<QuestionModel> questions;

    public CategoryModel(String id, String name, List<QuestionModel> questions) {
        this.id = id;
        this.name = name;
        this.questions = questions;
    }

    @JsonView(Views.Basic.class)
    public String getName() {
        return name;
    }

//    @JsonView(Views.Full.class)
    public List<QuestionModel> getQuestions() {
        return questions;
    }

    @JsonView(Views.Basic.class)
    public String getId() {
        return id;
    }
}
