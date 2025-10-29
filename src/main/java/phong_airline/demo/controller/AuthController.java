package phong_airline.demo.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import phong_airline.demo.dtos.LoginRequest;
import phong_airline.demo.dtos.LoginResponse;
import phong_airline.demo.dtos.RegistrationRequest;
import phong_airline.demo.dtos.Response;
import phong_airline.demo.services.AuthService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Response<?>> register(@Valid @RequestBody RegistrationRequest registrationRequest){
        return ResponseEntity.ok(authService.register(registrationRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<Response<LoginResponse>> login(@Valid @RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(authService.login(loginRequest));
    }
}
