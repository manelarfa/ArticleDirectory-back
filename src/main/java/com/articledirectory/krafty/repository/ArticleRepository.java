package com.articledirectory.krafty.repository;

import com.articledirectory.krafty.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article,String> {
}
