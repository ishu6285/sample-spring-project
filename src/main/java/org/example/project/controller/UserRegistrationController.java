package org.example.project.controller;

import org.example.project.dto.request.UserRegistrationApiRequest;
import org.example.project.dto.response.UserRegistrationApiResponse;
import org.example.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/user")
public class UserRegistrationController {
    @Autowired
    UserService userService;

    @PostMapping("/registration")
    public UserRegistrationApiResponse saveUser(@RequestBody UserRegistrationApiRequest request){
        return userService.saveUser(request);

    }
}
