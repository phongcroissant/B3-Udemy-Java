package phong_airline.demo.dtos;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import phong_airline.demo.enums.FlightStatus;
import java.math.BigDecimal;
import phong_airline.demo.entities.User;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class FlightDTO {

    private Long id;

    private String flightNumber;

    private FlightStatus status;

    private AirportDTO  departureAirport;

    private AirportDTO arrivalAirport;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private BigDecimal basePrice;

    private User assignedPilot;

    private List<BookingDTO> bookings = new ArrayList<>();

    private String departureAirportIataCode;
    private String arrivalAirportIataCode;
}
