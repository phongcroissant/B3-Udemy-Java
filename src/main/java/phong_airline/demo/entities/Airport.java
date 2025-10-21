package phong_airline.demo.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import phong_airline.demo.enums.City;
import phong_airline.demo.enums.Country;

@Entity
@Data
@Table(name = "airports")
@AllArgsConstructor
@NoArgsConstructor

public class Airport {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    @Enumerated(EnumType.STRING)
    private City city;

    @Column(nullable=false)
    @Enumerated(EnumType.STRING)
    private Country country;

    @Column(unique=true, nullable=false, length=3)
    private String iataCode;

}
