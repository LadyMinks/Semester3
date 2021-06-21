package com.example.thirtylistsapi.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class CategoryRepository implements Model{

    private final HashMap<String, CategoryModel> categories;

    public CategoryRepository() {
        this.categories = new HashMap<>();
        List<QuestionModel> movieQuestions = new ArrayList<>();
        movieQuestions.add(new QuestionModel("Snow White"));
        movieQuestions.add(new QuestionModel("Robin Hood"));
        movieQuestions.add(new QuestionModel("Aristocrats"));
        movieQuestions.add(new QuestionModel("Cinderella"));
        movieQuestions.add(new QuestionModel("Sleeping Beauty"));

        CategoryModel disneyMovies = new CategoryModel("disney_movies","Disney Movies", movieQuestions);
        this.categories.put(disneyMovies.getId(), disneyMovies);
    }

    public HashMap<String, CategoryModel> getCategories() {
        return categories;
    }

    public CategoryModel getCategory(String id){
        return categories.get(id);
    }
}
