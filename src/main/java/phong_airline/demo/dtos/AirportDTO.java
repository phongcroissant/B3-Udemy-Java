package phong_airline.demo.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import phong_airline.demo.enums.City;
import phong_airline.demo.enums.Country;

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
