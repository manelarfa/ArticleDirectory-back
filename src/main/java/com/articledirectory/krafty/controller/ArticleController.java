package com.articledirectory.krafty.controller;

import com.articledirectory.krafty.model.Article;
import com.articledirectory.krafty.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(method = RequestMethod.PUT,value = "/save")
    public Article[] save(@RequestBody Article articles[] ) {
    return articleService.saveAllArticles(articles);
    }

    @RequestMapping("/fetch")
    public Article[] fetchAllArticles() {
    return articleService.fetchAllArticles();
    }
}
