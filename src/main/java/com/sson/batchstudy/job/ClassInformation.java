package com.sson.batchstudy.job;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ClassInformation {
    private String teacherName;
    private int studentSize;

    public ClassInformation(String teacherName, int studentSize) {
        this.teacherName = teacherName;
        this.studentSize = studentSize;
    }
}
