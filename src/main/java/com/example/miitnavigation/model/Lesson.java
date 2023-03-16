package com.example.miitnavigation.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Calendar;

@Getter
@Setter
//@Entity
@AllArgsConstructor
@NoArgsConstructor
//@Table
public class Lesson {
    //    @Id
    private long id;
    private int dayOfWeek; // день недели
    private Calendar time; // время начала занятия
    private String courseName; // название курса
    private String lecturerName; // имя преподавателя
    private String classroom; // аудитория
    private boolean isEven; //чётность учебной недели
}
