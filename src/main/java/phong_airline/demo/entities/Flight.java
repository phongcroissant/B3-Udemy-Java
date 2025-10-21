package phong_airline.demo.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "flights")
@AllArgsConstructor
@NoArgsConstructor

public class Flight {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true,nullable=false)
    private String flightNumber;

    @Enumerated(EnumType.STRING)
    private FlightStatus status;

    @ManyToOne
    @JoinColumn(name="departure_airport_id")
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name="arrival_airport_id")
    private Airport arrivalAirport;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private BigDecimal basePrice;

    @ManyToOne
    private User assignedPilot;

    @OneToMany(mappedBy="flight")
    private List<Booking> bookings = new ArrayList<>();
}
