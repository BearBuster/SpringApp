package com.example.dima_spring.repository;

import com.example.dima_spring.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // Аннотация которая называет наш интерфейс репозиторием
public interface PostRepository
        extends CrudRepository<Post, Long> // Наследуемся от общего класса CrudRepository в котором уже есть стандартные методы поиск в базе
{

}
