package com.example.dima_spring.crudRepository;

import com.example.dima_spring.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

}
