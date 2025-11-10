package phong_airline.demo.services;


import java.util.List;

import phong_airline.demo.dtos.BookingDTO;
import phong_airline.demo.dtos.CreateBookingRequest;
import phong_airline.demo.dtos.Response;
import phong_airline.demo.enums.BookingStatus;

public interface BookingService {

    Response<?> createBooking(CreateBookingRequest createBookingRequest);
    Response<BookingDTO> getBookingById(Long id);
    Response<List<BookingDTO>> getAllBookings();
    Response<List<BookingDTO>> getMyBookings();
    Response<?> updateBookingStatus(Long id, BookingStatus status);
}
