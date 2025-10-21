package phong_airline.demo.dtos;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookingDTO {

    private Long id;

    private String bookingReference;

    private UserDTO user;

    private FlightDTO flight;

    private LocalDateTime bookingDate;

    private BookingStatus status;

    private List<PassengerDTO> passengeres = new ArrayList<>();
}
