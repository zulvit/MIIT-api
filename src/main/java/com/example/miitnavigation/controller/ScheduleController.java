package com.example.miitnavigation.controller;

import com.example.miitnavigation.dto.LessonDTO;
import com.example.miitnavigation.mapper.LessonMapper;
import com.example.miitnavigation.model.Lesson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.GregorianCalendar;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @GetMapping
    public LessonDTO test() {
        Lesson lesson = new Lesson(1, 2, new GregorianCalendar(2017, Calendar.JANUARY, 25), "Lolok", "dddd",
                "1551", true);
        return LessonMapper.INSTANCE.toDTO(lesson);
    }
}
