package com.springboot.mariadb.gradeservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "grades")
@NoArgsConstructor
@AllArgsConstructor
@IdClass(GradeId.class)
public class Grades  {
    @Id
    private int studentId;
    @Id
    private String semester;
    private String  subject1Grade;
    private String  subject2Grade;
    private String  subject3Grade;
    private String  subject4Grade;
    private String  subject5Grade;

}
