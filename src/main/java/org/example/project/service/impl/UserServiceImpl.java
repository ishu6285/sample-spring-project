package org.example.project.service.impl;

import org.example.project.dto.request.UserRegistrationApiRequest;
import org.example.project.dto.response.UserRegistrationApiResponse;
import org.example.project.entity.UserEntity;
import org.example.project.repository.UserRepository;
import org.example.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserRegistrationApiResponse saveUser(UserRegistrationApiRequest request) {

        //create object response class
        UserRegistrationApiResponse response =new UserRegistrationApiResponse();

        //create object entity class
        UserEntity save =new UserEntity();

        //set the table data using getter setter
        save.setName(request.getName());
        save.setEmail(request.getEmail());
        save.setPassword(request.getPassword());

        userRepository.save(save);

        response.setMessage("user registration successfully");
        response.setStatus("200");
        response.setResponseCode("1200");


        return response;
    }
}
