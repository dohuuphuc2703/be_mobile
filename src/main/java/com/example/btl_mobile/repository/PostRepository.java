package com.example.btl_mobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.btl_mobile.model.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
