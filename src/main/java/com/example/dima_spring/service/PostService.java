package com.example.dima_spring.service;

import com.example.dima_spring.model.Post;
import com.example.dima_spring.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service // Аннотация которая показывает что нащ Класс это сервис где будет наша бизнес логика
public class PostService {
    private final PostRepository postRepository; // Сылка на наш репозиторий с функциями для базы данных

    @Autowired // Аннотация которая автоманически вписывает значения в функцию, что бы не создавать новые
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    // Функция которая достает все нащи посты
    public List<Post> findAll(){
        return (List<Post>) postRepository.findAll(); // Вызов метода из Репозиторя который находит все посты
    }
    // Функция которая достает пост по id
    public Optional<Post> find(long id){
        return postRepository.findById(id); // Вызов метода из Репозитория который находит посты по id
    }

}
