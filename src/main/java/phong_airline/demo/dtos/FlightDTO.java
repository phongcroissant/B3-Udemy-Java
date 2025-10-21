package phong_airline.demo.dtos;

import java.time.LocalDateTime;

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
