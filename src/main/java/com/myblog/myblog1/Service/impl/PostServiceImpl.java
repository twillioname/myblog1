package com.myblog.myblog1.Service.impl;

import com.myblog.myblog1.Entity.Post;
import com.myblog.myblog1.Exception.ResourceNotFoundException;
import com.myblog.myblog1.Payload.PostDto;
import com.myblog.myblog1.Repository.PostRepository;
import com.myblog.myblog1.Service.PostService;
import org.springframework.stereotype.Service;
@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {

        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post savedpost = postRepository.save(post);

        PostDto dto = new PostDto();

        dto.setTitle(savedpost.getTitle());
        dto.setDescription(savedpost.getDescription());
        dto.setContent(savedpost.getContent());

        return dto;
    }

    @Override
    public PostDto getPostById(long id) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Post Not Found with Id:" + id));

        PostDto dto = new PostDto();

        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());

        return dto;
    }
}
