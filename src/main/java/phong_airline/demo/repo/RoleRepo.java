package phong_airline.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import phong_airline.demo.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);
    
}
