package phong_airline.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import phong_airline.demo.entities.EmailNotification;

public interface EmailNotificationRepo extends JpaRepository<EmailNotification, Long> {

}
