package phong_airline.demo.services;




import java.util.List;

import phong_airline.demo.dtos.Response;
import phong_airline.demo.dtos.UserDTO;
import phong_airline.demo.entities.User;

public interface UserService {

    User currentUser();

    Response<?> updateMyAccount(UserDTO userDTO);

    Response<List<UserDTO>> getAllPilots();

    Response<UserDTO> getAccountDetails();
}
