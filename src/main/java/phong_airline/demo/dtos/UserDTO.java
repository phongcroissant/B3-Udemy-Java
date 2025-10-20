package phong_airline.demo.dtos;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import phong_airline.demo.enums.AuthMethod;
import phong_airline.demo.entities.Booking;
import phong_airline.demo.entities.Role;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {
    
    private Long id;

    private String name;

    private String email;
    
    private String phoneNumber;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private boolean emailVerified;

    private AuthMethod provider;

    private String providerId;

  
    private List<Role> roles;

    private boolean active;
    
    private List<Booking> bookings;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
