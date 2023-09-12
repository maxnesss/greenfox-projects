package com.greenfox.aze.reddit.repositories;

import com.greenfox.aze.reddit.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
}
