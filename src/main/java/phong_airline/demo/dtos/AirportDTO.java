package phong_airline.demo.dtos;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AirportDTO {

    private Long id;

    @NotBlank(message="name is required")
    private String name;

    @NotNull(message="city is required")
    private City city;

    @NotNull(message="country is required")
    private Country country;

    @NotBlank(message="iataCode is required")
    private String iataCode;
}
