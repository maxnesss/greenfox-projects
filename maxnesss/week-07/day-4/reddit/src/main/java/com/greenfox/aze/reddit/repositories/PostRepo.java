package com.greenfox.aze.reddit.repositories;

import com.greenfox.aze.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends CrudRepository<Post,Long> {
}
