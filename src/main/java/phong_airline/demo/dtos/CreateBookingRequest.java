package phong_airline.demo.dtos;

import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

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
