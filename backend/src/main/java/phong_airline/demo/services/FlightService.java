package phong_airline.demo.services;



import java.time.LocalDate;
import java.util.List;

import phong_airline.demo.dtos.CreateFlightRequest;
import phong_airline.demo.dtos.FlightDTO;
import phong_airline.demo.dtos.Response;
import phong_airline.demo.enums.City;
import phong_airline.demo.enums.Country;
import phong_airline.demo.enums.FlightStatus;

public interface FlightService {

    Response<?> createFlight(CreateFlightRequest createFlightRequest);
    Response<FlightDTO> getFlightById(Long id);
    Response<List<FlightDTO>> getAllFlights();
    Response<?> updateFlight(CreateFlightRequest createFlightRequest);
    Response<List<FlightDTO>> searchFlight(String departurePortIata, String arrivalPortIata, FlightStatus status, LocalDate departureDate);
    Response<List<City>> getAllCities();
    Response<List<Country>> getAllCountries();

}
