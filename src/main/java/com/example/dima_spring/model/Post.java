package com.example.dima_spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

// Аннатация которая показывает проге что нужно искать такую табл. в базе
@Entity
public class Post { // Название Класса / Таблички
    @Id // показывает что переменая под аннотацией является id в таблице
    @GeneratedValue(strategy = GenerationType.AUTO) // показывает что переменная под аннотацией автоматически генирируется
    private Long id;
    private String title;
    private String description;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private String CreatedBy;


    public Post(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Post() {

    }

    // Getter Setter для получения и установки значений
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }
}
