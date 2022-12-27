package com.springboot.mariadb.gradeservice.controller;

import com.springboot.mariadb.gradeservice.entity.Grades;
import com.springboot.mariadb.gradeservice.entity.StudentResponse;
import com.springboot.mariadb.gradeservice.service.GradesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grades")
public class GradesController {
    @Autowired
    private GradesService gradesService;

    @PostMapping("/upload")
    public StudentResponse uploadGrades(@RequestBody Grades grades){
        return gradesService.uploadGrades(grades);
    }

    @GetMapping("/getAllGrades/{id}")
    public List<Grades> getAllGrades(@PathVariable int id){
        return gradesService.getAllGrades(id);
    }


}
