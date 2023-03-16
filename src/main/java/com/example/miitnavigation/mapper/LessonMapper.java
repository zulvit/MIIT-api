package com.example.miitnavigation.mapper;

import com.example.miitnavigation.dto.LessonDTO;
import com.example.miitnavigation.model.Lesson;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LessonMapper {
    LessonMapper INSTANCE = Mappers.getMapper(LessonMapper.class);

    LessonDTO toDTO(Lesson lesson);
}
