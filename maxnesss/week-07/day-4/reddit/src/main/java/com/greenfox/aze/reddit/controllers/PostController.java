package com.greenfox.aze.reddit.controllers;

import com.greenfox.aze.reddit.models.Post;
import com.greenfox.aze.reddit.services.PostService;
import com.greenfox.aze.reddit.services.UserService;
import com.greenfox.aze.reddit.services.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/posts/")
@CrossOrigin
public class PostController {
    private PostService postService;
    private UserService userService;
    private VoteService voteService;

    @Autowired
    public PostController(PostService postService, UserService userService, VoteService voteService) {
        this.postService = postService;
        this.userService = userService;
        this.voteService = voteService;
    }

    @GetMapping("/")
    public ResponseEntity<?> getPosts() {
        Map<String, Iterable<Post>> posts = new HashMap<>();
        posts.put("posts", postService.getAll());

        return ResponseEntity.status(HttpStatus.OK).body(posts);
    }

    @PostMapping("/")
    public ResponseEntity<?> addPost(@RequestBody Post post, @RequestHeader(value = "username", required = true) Long userId ) {
        userService.getUserById(userId);//opak

        return ResponseEntity.status(HttpStatus.OK).body(postService.postPost(post,userService.getUserById(userId).getName()));
    }

    @PutMapping("/{id}/upvote")
    public ResponseEntity<?> upvote(@PathVariable(required = false) Long id, @RequestHeader(value = "username", required = true) Long uid) {
        voteService.plusVote(userService.getUserById(uid), postService.getPost(id));
        return ResponseEntity.status(HttpStatus.OK).body(postService.upvote(id));
    }

    @PutMapping("/{id}/downvote")
    public ResponseEntity<?> downvote(@PathVariable(required = false) Long id, @RequestHeader(value = "username", required = true) Long uid) {
        voteService.minusVote(userService.getUserById(uid), postService.getPost(id));
        return ResponseEntity.status(HttpStatus.OK).body(postService.downvote(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePost(@PathVariable(required = false) Long id,@RequestHeader(required = true, value = "username") Long userId) {
        if (Objects.equals(userService.getUserById(userId).getName(), postService.getPost(id).getUser())){
            return ResponseEntity.status(HttpStatus.OK).body(postService.deletePost(id));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updatePost(@PathVariable(required = false) Long id,@RequestBody Post post) {
        return ResponseEntity.status(HttpStatus.OK).body(postService.updatePost(id,post));
    }
}
