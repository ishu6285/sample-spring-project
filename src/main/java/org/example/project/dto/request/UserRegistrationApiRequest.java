package org.example.project.dto.request;


import lombok.Data;

@Data

public class UserRegistrationApiRequest {
    private String name;
    private String email;
    private String password;
}
