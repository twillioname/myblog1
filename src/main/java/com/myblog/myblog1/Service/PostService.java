package com.myblog.myblog1.Service;

import com.myblog.myblog1.Payload.PostDto;

public interface PostService  {
       PostDto createPost (PostDto postDto);

    PostDto getPostById(long id);
}
