package phong_airline.demo.services;

import phong_airline.demo.dtos.LoginRequest;
import phong_airline.demo.dtos.LoginResponse;
import phong_airline.demo.dtos.RegistrationRequest;
import phong_airline.demo.dtos.Response;

public interface AuthService {

    Response<?> register(RegistrationRequest registrationRequest);
    Response<LoginResponse> login(LoginRequest loginRequest);
}
