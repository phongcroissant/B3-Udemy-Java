package phong_airline.demo.services;




import java.util.List;

import phong_airline.demo.dtos.Response;
import phong_airline.demo.dtos.RoleDTO;

public interface RoleService {
    Response<?> createRole(RoleDTO roleDTO);
    Response<?> updateRole(RoleDTO roleDTO);
    Response<List<RoleDTO>> getAllRoles();
}
