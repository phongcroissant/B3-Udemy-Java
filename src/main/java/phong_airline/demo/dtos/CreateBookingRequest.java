package phong_airline.demo.dtos;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateBookingRequest {

    @NotNull(message="Flight ID cannot be null")
    private Long flightId;

    @NotEmpty(message="At least one passenger must be provided")
    private List<PassengerDTO> passengers;


}
