package com.org.house.service;

import com.org.house.entity.User;
import com.org.house.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(String firsName, String lastName, String password, String email ){
        User user = User.builder()
                .firstName(firsName)
                .lastName(lastName)
                .email(email)
                .password(password)
                .build();

        return userRepository.save(user);
    }
}
