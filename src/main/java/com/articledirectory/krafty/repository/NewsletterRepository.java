package com.articledirectory.krafty.repository;

import com.articledirectory.krafty.model.Newsletter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsletterRepository extends MongoRepository<Newsletter,String> {
    public Newsletter findByEmail(String email);
}
