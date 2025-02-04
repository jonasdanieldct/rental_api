package com.jddc.rental_api.service;

import com.jddc.rental_api.model.UserEntity;
import com.jddc.rental_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service public class UserService {

    @Autowired UserRepository userRepository;

    public String testService(){
        return "UserService.testService()";
    }

    public UserEntity saveUser(UserEntity userEntity){
        return userRepository.save(userEntity);
    }
}
