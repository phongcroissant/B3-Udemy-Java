package phong_airline.demo.services;


import phong_airline.demo.entities.Booking;
import phong_airline.demo.entities.User;

public interface EmailNotificationService {

    void sendBookingTickerEmail(Booking booking);
    void sendWelcomeEmail(User user);

}
