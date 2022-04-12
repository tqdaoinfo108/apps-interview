package vn.daotq.interviewapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.daotq.interviewapp.model.Category;
import vn.daotq.interviewapp.repository.CategoriesRepository;

import java.net.URISyntaxException;

@RestController
public class CateloryController {

    @Autowired
    CategoriesRepository categoriesRepository;

    @GetMapping("/category/getall")
    public ResponseEntity<Category> getAllCategory() {
        return new ResponseEntity(categoriesRepository.getAll(), HttpStatus.OK);
    }
}