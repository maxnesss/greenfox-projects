package com.greenfox.aze.reddit.services;

import com.greenfox.aze.reddit.models.Post;

public interface PostService {
    Iterable<Post> getAll();
    Post postPost(Post post, String name);
    Post upvote(Long index);
    Post downvote(Long index);
    Post deletePost(Long index);
    Post updatePost(Long index, Post post);
    Post getPost(Long index);
}
