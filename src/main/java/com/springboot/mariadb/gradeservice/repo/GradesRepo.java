package com.springboot.mariadb.gradeservice.repo;

import com.springboot.mariadb.gradeservice.entity.Grades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradesRepo extends JpaRepository<Grades,Integer> {
    List<Grades> findAllByStudentId(int id);
}
