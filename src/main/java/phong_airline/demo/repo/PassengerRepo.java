package phong_airline.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import phong_airline.demo.entities.Passenger;

public interface PassengerRepo extends JpaRepository<Passenger, Long> {
    

}
