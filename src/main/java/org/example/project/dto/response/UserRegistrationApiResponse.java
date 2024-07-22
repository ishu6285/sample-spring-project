package org.example.project.dto.response;
import lombok.Data;


@Data
public class UserRegistrationApiResponse {
    private String message;
    private String responseCode;
    private String status;

}
