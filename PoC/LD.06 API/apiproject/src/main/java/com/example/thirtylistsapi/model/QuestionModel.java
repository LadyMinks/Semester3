package com.example.thirtylistsapi.model;

public class QuestionModel implements Model {

    private String name;

    public QuestionModel(String question) {
        this.name = question;
    }

    public String getQuestion() {
        return name;
    }
}
