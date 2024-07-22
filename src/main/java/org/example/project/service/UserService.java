package org.example.project.service;

import org.example.project.dto.request.UserRegistrationApiRequest;
import org.example.project.dto.response.UserRegistrationApiResponse;

public interface UserService {
    UserRegistrationApiResponse saveUser(UserRegistrationApiRequest request);
}
