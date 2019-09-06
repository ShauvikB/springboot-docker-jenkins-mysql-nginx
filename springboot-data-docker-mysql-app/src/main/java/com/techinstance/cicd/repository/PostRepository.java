package com.techinstance.cicd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techinstance.cicd.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
