package com.myblog.myblog1.Repository;

import com.myblog.myblog1.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long>{
}
