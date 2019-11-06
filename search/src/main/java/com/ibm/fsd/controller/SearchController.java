package com.ibm.fsd.controller;

import com.ibm.fsd.service.SearchService;
import com.ibm.fsd.dto.TTraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/search")
public class SearchController {
    @Autowired
    private SearchService searchService;

    @GetMapping("/course/list")
    public ResponseEntity<List<TTraining>> findAllCourse(){
        List<TTraining> allCourse = searchService.findAllCourse();
        return ResponseEntity.ok(allCourse);
    }
}
