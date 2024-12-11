package com.jddc.rental_api.service;

import com.jddc.rental_api.model.User;
import com.jddc.rental_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service public class UserService {

    @Autowired UserRepository userRepository;

    public String testService(){
        return "UserService.testService()";
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }
}
