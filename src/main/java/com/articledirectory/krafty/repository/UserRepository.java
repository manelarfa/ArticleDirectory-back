package com.articledirectory.krafty.repository;

import com.articledirectory.krafty.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
    public User findByUsername(String username);
}
