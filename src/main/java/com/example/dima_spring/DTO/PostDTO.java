package com.example.dima_spring.DTO;

import javax.validation.constraints.NotEmpty;

// Наш Класс обертка нашей модели, то что видет пользователь на странице
public class PostDTO {

    @NotEmpty(message = "Title must be not empty")
    private String title;
    @NotEmpty(message = "Title must be not empty")
    private String description;

    // Getter Setter для получения и установки значений
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
}
