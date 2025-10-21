package phong_airline.demo.dtos;

@Data
public class LoginRequest {

    @NotBlank(message="Email is required")
    @Email(message="Invalid email format")
    private String email;

    @NotBlank(message="Password is required")
    private String password;

}
