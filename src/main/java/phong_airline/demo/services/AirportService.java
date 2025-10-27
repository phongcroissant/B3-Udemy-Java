package phong_airline.demo.services;



import java.util.List;

import phong_airline.demo.dtos.AirportDTO;
import phong_airline.demo.dtos.Response;

public interface AirportService {

    Response<?> createAirport(AirportDTO airportDTO);

    Response<?> updateAirport(AirportDTO airportDTO);

    Response<List<AirportDTO>> getAllAirports();

    Response<AirportDTO> getAirportById(Long id);

}
