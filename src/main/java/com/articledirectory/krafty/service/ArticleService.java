package com.articledirectory.krafty.service;

import com.articledirectory.krafty.model.Article;
import com.articledirectory.krafty.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    //Save Operation
    public Article[] saveAllArticles(Article[] articles) {
        articleRepository.deleteAll();
        for(int i=0;i<articles.length;i++)
            articleRepository.save(articles[i]);
        return articles;
    }
    //Fetch Operation
    public Article[] fetchAllArticles() {
        List<Article> articles= articleRepository.findAll();
        Article[] articlesA=new Article[articles.size()];
        for(int i=0;i<articles.size();i++) {
            articlesA[i]=articles.get(i);
        }
        return articlesA;
    }
}
