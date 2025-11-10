package phong_airline.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import phong_airline.demo.entities.Airport;

public interface AirportRepo extends JpaRepository<Airport, Long> {

    Optional<Airport> findByIataCode(String iataCode);
    
}
