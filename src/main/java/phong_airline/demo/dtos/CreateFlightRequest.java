package phong_airline.demo.dtos;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateFlightRequest {

    private Long id;

    private FlightStatus status;

    @NotBlank(message="Flight Number cannot be blank")
    private String flightNumber;

    @NotBlank(message="Departure airport IATA code cannot be blank")
    private String departureAirportIataCode;

    @NotBlank(message="Arrival airport IATA code cannot be blank")
    private String arrivalAirportIataCode;
    @NotNull(message="Departure time cannot be null")
    private LocalDataTime departureTime;

    @NotNull(message="Arrival time cannot be null")
    private LocalDataTime arrivalTime;

    @NotNull(message="Base price cannot be null")
    @Positive(message="Base price must be positive")
    private BigDecimal basePrice;

    private Long pilotId;
}
