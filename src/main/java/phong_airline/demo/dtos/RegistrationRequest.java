package phong_airline.demo.dtos;

@Data
public class RegistrationRequest {

    @NotBlank(message="Name is required")
    private String name;
    
    @NotBlank(message="Email is required")
    @Email(message="Invalid Email Format")
    private String email;

    private String password;

    private String phoneNumber;

    private List<String> roles;
}
