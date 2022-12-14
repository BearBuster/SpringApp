package com.example.dima_spring.controller;

import com.example.dima_spring.DTO.PostDTO;
import com.example.dima_spring.model.Post;
import com.example.dima_spring.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/post")
public class PostController {

    private final PostService postService;
    private final ModelMapper modelMapper;

    @Autowired
    public PostController(PostService postService, ModelMapper modelMapper) {
        this.postService = postService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<PostDTO> getAll(){
        return postService.findAll().stream().map(e -> modelMapper.map(e, PostDTO.class)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Post getPost(@PathVariable("id") long id){
        return postService.find(id).get();
    }

    private Post convertToPost(PostDTO postDTO) {
        return modelMapper.map(postDTO, Post.class);
    }

    private PostDTO convertToPostDTO(Post post){
        return modelMapper.map(post, PostDTO.class);
    }

}
