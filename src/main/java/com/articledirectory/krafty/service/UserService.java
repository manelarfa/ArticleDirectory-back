package com.articledirectory.krafty.service;

import com.articledirectory.krafty.model.User;
import com.articledirectory.krafty.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User register(User user) {
        User temp=userRepository.findByUsername(user.getUsername());
        if(temp==null) {
            user.setValid(true);
            return userRepository.save(user);
        }else {
            user.setValid(false);
            return user;
        }
    }

    public User login(User user) {
        User temp=userRepository.findByUsername(user.getUsername());
        if(temp!=null && temp.getPassword().equals(user.getPassword())) {
            user.setValid(true);
            return user;
        }else {
            user.setValid(false);
            return  user;
        }
    }
}
