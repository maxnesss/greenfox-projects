package com.example.newsletterbackend.repo;

import com.example.newsletterbackend.models.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepo extends ListCrudRepository<User,Long> {
}
