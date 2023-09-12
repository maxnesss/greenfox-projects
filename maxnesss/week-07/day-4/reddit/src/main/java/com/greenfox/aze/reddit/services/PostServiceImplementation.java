package com.greenfox.aze.reddit.services;

import com.greenfox.aze.reddit.exeptions.AppExeption;
import com.greenfox.aze.reddit.models.Post;
import com.greenfox.aze.reddit.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostServiceImplementation implements PostService{

    private PostRepo postRepo;

    @Autowired
    public PostServiceImplementation(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public Iterable<Post> getAll() {
        return postRepo.findAll();
    }

    @Override
    public Post postPost(Post post, String name) {
        post.setScore(0);
        post.setUser(name);
        postRepo.save(post);
        return post;
    }

    @Override
    public Post upvote(Long index) {
        Optional<Post> maybePost = postRepo.findById(index);
        if (maybePost.isEmpty()){
            throw new AppExeption("non-existing index", HttpStatus.BAD_REQUEST);
        }
        Post post = maybePost.get();
        post.setScore(post.getScore()+1);
        postRepo.save(post);
        return post;
    }

    @Override
    public Post downvote(Long index) {
        Optional<Post> maybePost = postRepo.findById(index);
        if (maybePost.isEmpty()){
            return null;
        }
        Post post = maybePost.get();
        post.setScore(post.getScore()-1);
        postRepo.save(post);
        return post;
    }

    @Override
    public Post deletePost(Long index) {
        Optional<Post> maybePost = postRepo.findById(index);
        if (maybePost.isEmpty()){
            return null;
        }
        Post post = maybePost.get();
        postRepo.deleteById(index);
        return post;
    }

    @Override
    public Post updatePost(Long index, Post post) {
        Optional<Post> maybePost = postRepo.findById(index);
        if (maybePost.isEmpty()){
            return null;
        }
        Post oldPost = maybePost.get();
        oldPost.setTitle(post.getTitle());
        oldPost.setUrl(post.getUrl());
        postRepo.save(oldPost);
        return oldPost;
    }

    @Override
    public Post getPost(Long index) {
        Optional<Post> maybePost = postRepo.findById(index);
        if (maybePost.isEmpty()){
            throw new AppExeption("non-existing index", HttpStatus.BAD_REQUEST);
        }
        return maybePost.get();
    }

}
