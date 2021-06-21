package com.example.thirtylistsapi.controler;

import com.example.thirtylistsapi.model.CategoryModel;
import com.example.thirtylistsapi.model.CategoryRepository;
import com.example.thirtylistsapi.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RequestMapping("list")
@RestController
public class ListController {

    private CategoryRepository categoryRepository;

    @Autowired
    public ListController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    @JsonView(Views.Basic.class)
    public HashMap<String, CategoryModel> getCategories(){
        return categoryRepository.getCategories();
    }

    @GetMapping(path = "{id}")
    public CategoryModel getCategory(@PathVariable("id") String id){
        return categoryRepository.getCategory(id);
    }
}
