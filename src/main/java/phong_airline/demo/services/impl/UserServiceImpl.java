package phong_airline.demo.services.impl;



import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import phong_airline.demo.dtos.Response;
import phong_airline.demo.dtos.UserDTO;
import phong_airline.demo.entities.User;
import phong_airline.demo.exceptions.NotFoundException;
import phong_airline.demo.repo.UserRepo;
import phong_airline.demo.services.UserService;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;


    @Override
    public User currentUser() {

        String email = SecurityContextHolder.getContext().getAuthentication().getName();

        return userRepo.findByEmail(email)
                .orElseThrow(()-> new NotFoundException("User Not Found"));
    }


    @Override
    @Transactional
    public Response<?> updateMyAccount(UserDTO userDTO) {
       log.info("Inside updateMyAccount()");

       log.info(String.valueOf(userDTO));

       User user = currentUser();

       if (userDTO.getName() != null && !userDTO.getName().isBlank()){
           user.setName(userDTO.getName());
       }

        if (userDTO.getPhoneNumber() != null && !userDTO.getPhoneNumber().isBlank()){
            user.setPhoneNumber(userDTO.getPhoneNumber());
        }

        if (userDTO.getPassword() != null && !userDTO.getPassword().isBlank()){
            String encodedPassword = passwordEncoder.encode(userDTO.getPassword());
            user.setPassword(encodedPassword);
        }

        user.setUpdatedAt(LocalDateTime.now());

        userRepo.save(user);

        return Response.builder()
                .statusCode(HttpStatus.OK.value())
                .message("Account Updated Successfully")
                .build();



    }


    @Override
    public Response<List<UserDTO>> getAllPilots() {
        log.info("Inside getAllPilots()");

        List<UserDTO> pilots = userRepo.findByRoleName("PILOT").stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .toList();

        return Response.<List<UserDTO>>builder()
                .statusCode(HttpStatus.OK.value())
                .message(pilots.isEmpty() ? "No pilots Found" : "pilots retrieved succesfully")
                .data(pilots)
                .build();
    }


    @Override
    public Response<UserDTO> getAccountDetails() {
        log.info("Inside getAccountDetails()");

        User user = currentUser();

        UserDTO userDTO = modelMapper.map(user, UserDTO.class);

        return Response.<UserDTO>builder()
                .statusCode(HttpStatus.OK.value())
                .message("success")
                .data(userDTO)
                .build();
    }


}
