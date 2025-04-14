package com.app.threetier.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TaskDTO {
    private Long id;
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private double average;
}
