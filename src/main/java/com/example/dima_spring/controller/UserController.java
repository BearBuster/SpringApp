package com.example.dima_spring.controller;

import com.example.dima_spring.DTO.MyUserDetailsDTO;
import com.example.dima_spring.model.MyUserDetails;
import com.example.dima_spring.service.MyUserDetailsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController // Аноотация которая показывает что класс является контроллером
@RequestMapping("/api/user") //Путь который должен ввести пользователь для того что бы попкасть в эту часть кода / в этот контроллер
public class UserController {

    private final MyUserDetailsService myUserDetailsService; // Наш сервис
    private final ModelMapper modelMapper; // наш класс который связывает DAO c Моделью. Может сопоставить все поля

    @Autowired // Аннотация которая автоматически подставит значения, что бы не создавать их занново
    public UserController(MyUserDetailsService myUserDetailsService, ModelMapper modelMapper) { // Конструтор класса
        this.myUserDetailsService = myUserDetailsService;
        this.modelMapper = modelMapper;
    }

    @GetMapping // Аннотация которая показывает что наша функция будет вызвана при GET запросе сайта
    public List<MyUserDetailsDTO> findAllUsers(){
        return myUserDetailsService.findAll() // Использует Сервис что бы получить все значение из таблицы post
                .stream()
                .map(e -> modelMapper.map(e, MyUserDetailsDTO.class))// Сопоставляет все значения из модели с DAO классом
                .collect(Collectors.toList()); // Собирает все значения в Список
    }

    @GetMapping("/{id}") // Аннотация как обычний GetMapping, только смотрит на те запросы где есть переменная после слэша
    public MyUserDetails findUserById(
            @PathVariable(value = "id") // Аннотация которая говоритт о том что значение {id} из запроса должно вставится в переменую
            Long id
    ){
        return myUserDetailsService.findById(id); // Использует наш сервис для поиска Поста по id
    }

    @PostMapping // Не работает. Аннотация которая отвечает за Post запросы
    public String saveUser(
//            @RequestBody MyUserDetailsDTO myUserDetailsDTO
    ){
//        myUserDetailsService.saveMyUserDetails(modelMapper.map(myUserDetailsDTO, MyUserDetails.class));
        return "asdqwe";
//                ResponseEntity.ok(HttpStatus.OK);
    }

}
