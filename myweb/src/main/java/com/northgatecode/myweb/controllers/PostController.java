package com.northgatecode.myweb.controllers;

import com.northgatecode.myweb.mappers.PostMapper;
import com.northgatecode.myweb.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("post")
public class PostController {
    private PostMapper postMapper;

    @Autowired
    public PostController(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity index() {
        List<Post> posts = postMapper.getPostAll();
        return ResponseEntity.ok(posts);
    }
}
