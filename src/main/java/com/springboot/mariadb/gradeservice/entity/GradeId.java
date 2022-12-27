package com.springboot.mariadb.gradeservice.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class GradeId implements Serializable {
    private int studentId;
    private String semester;
}
