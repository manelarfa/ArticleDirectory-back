package com.articledirectory.krafty.controller;

import com.articledirectory.krafty.model.Newsletter;
import com.articledirectory.krafty.service.NewsletterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class NewsletterController {

    @Autowired
    private NewsletterService newsletterService;

    @RequestMapping(method = RequestMethod.POST,value="/subscribe")
    public Newsletter subscribe(@RequestBody Newsletter newsletter) {
        return newsletterService.subscribe(newsletter);
    }
}
