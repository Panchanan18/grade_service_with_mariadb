package com.springboot.mariadb.gradeservice.service;

import com.springboot.mariadb.gradeservice.entity.Grades;
import com.springboot.mariadb.gradeservice.entity.Student;
import com.springboot.mariadb.gradeservice.entity.StudentResponse;
import com.springboot.mariadb.gradeservice.repo.GradesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class GradesService {
    @Autowired
    private GradesRepo gradesRepo;

    @Autowired
    private RestTemplate restTemplate;

    public StudentResponse uploadGrades(Grades grades) {
        StudentResponse  studentResponse = new StudentResponse();
        Grades savedGrades = gradesRepo.save(grades);
        Student student = restTemplate.getForObject("http://localhost:8083/student/getById/" + savedGrades.getStudentId(), Student.class);
        studentResponse.setStudent(student);
        studentResponse.setGradeList(Collections.singletonList(savedGrades));
        return studentResponse;

    }

    public List<Grades> getAllGrades(int id) {
        return gradesRepo.findAllByStudentId(id);
    }
}
