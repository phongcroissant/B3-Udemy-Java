package phong_airline.demo.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import phong_airline.demo.entities.User;
import phong_airline.demo.exceptions.NotFoundException;
import phong_airline.demo.repo.UserRepo;

@Service
@RequiredArgsConstructor

public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepo.findByEmail(username)
            .orElseThrow(()-> new NotFoundException("User Not Found"));

        return AuthUser.builder().user(user).build();
    }
}
