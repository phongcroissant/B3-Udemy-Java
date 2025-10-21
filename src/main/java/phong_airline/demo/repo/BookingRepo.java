package phong_airline.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import phong_airline.demo.entities.Booking;

public interface BookingRepo extends JpaRepository<Booking, Long>{

    List<Booking> findByYserIdOrderByIdDesc(Long userId);
    
}
