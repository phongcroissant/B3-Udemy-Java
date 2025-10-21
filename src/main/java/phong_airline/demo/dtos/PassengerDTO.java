package phong_airline.demo.dtos;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PassengerDTO {

    private Long id;

    @NotBlank(message="First Name cannot be blank")
    private String firstName;

    @NotBlank(message="Last Name cannot be blank")
    private String lastName;

    private String passportNumber;

    @NotBlank(message="Passenger Type cannot be blank")
    private PassengerType type;

    private String seatNumber;

    private String specialRequest;
}
