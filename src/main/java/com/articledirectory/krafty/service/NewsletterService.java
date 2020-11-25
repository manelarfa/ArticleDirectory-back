package com.articledirectory.krafty.service;

import com.articledirectory.krafty.model.Newsletter;
import com.articledirectory.krafty.repository.NewsletterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsletterService {

    @Autowired
    private NewsletterRepository newsletterRepository;

    public Newsletter subscribe(Newsletter newsletter) {
        Newsletter temp=newsletterRepository.findByEmail(newsletter.getEmail());
        if(temp==null) {
            newsletter.setExisting(false);
            return newsletterRepository.save(newsletter);
        }
        else {
            newsletter.setExisting(true);
            return newsletter;
        }
    }
}
