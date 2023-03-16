package com.example.miitnavigation.dto;

import java.util.Objects;

public class LessonDTO {
    private final String dayOfWeek; // день недели
    private final String time; // время начала занятия
    private final String courseName; // название курса
    private final String lecturerName; // имя преподавателя
    private final String classroom; // аудитория
    private final boolean isEven; //чётность учебной недели
    private final String group;

    public LessonDTO(String dayOfWeek, String time, String courseName, String lecturerName, String classroom, boolean isEven, String group) {
        this.dayOfWeek = dayOfWeek;
        this.time = time;
        this.courseName = courseName;
        this.lecturerName = lecturerName;
        this.classroom = classroom;
        this.isEven = isEven;
        this.group = group;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public String getTime() {
        return time;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public String getClassroom() {
        return classroom;
    }

    public boolean isEven() {
        return isEven;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LessonDTO lessonDTO = (LessonDTO) o;
        return isEven == lessonDTO.isEven && Objects.equals(dayOfWeek, lessonDTO.dayOfWeek)
                && Objects.equals(time, lessonDTO.time)
                && Objects.equals(courseName, lessonDTO.courseName)
                && Objects.equals(lecturerName, lessonDTO.lecturerName)
                && Objects.equals(classroom, lessonDTO.classroom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayOfWeek, time, courseName, lecturerName, classroom, isEven);
    }

    @Override
    public String toString() {
        return "LessonDTO{" +
                "dayOfWeek='" + dayOfWeek + '\'' +
                ", time='" + time + '\'' +
                ", courseName='" + courseName + '\'' +
                ", lecturerName='" + lecturerName + '\'' +
                ", classroom='" + classroom + '\'' +
                ", even=" + isEven +
                '}';
    }
}
