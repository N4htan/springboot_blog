package com.spring.codeblog.service;

import com.spring.codeblog.model.Post;

import java.util.List;

//onde definimos os metodos

public interface CodeblogService {

    List<Post> findAll(); //retorna uma lista de posts
    Post findById(long id); //retorna um unico post
    Post save(Post post); //recebe um novo post

}
