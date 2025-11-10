package phong_airline.demo.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import phong_airline.demo.entities.Flight;
import phong_airline.demo.enums.FlightStatus;

public interface FlightRepo extends JpaRepository<Flight, Long> {
    
    boolean existsByFlightNumber(String flightNumber);

    List<Flight> findByDepartureAirportIataCodeAndArrivalAirportIataCodeAndStatusAndDepartureTimeBetween(
        String departureIataCode, String arrivalIataCode, FlightStatus status, LocalDateTime startOfDay, LocalDateTime endOfDay
    );
}
