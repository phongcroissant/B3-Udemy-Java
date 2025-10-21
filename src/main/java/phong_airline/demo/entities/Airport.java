package phong_airline.demo.entities;

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
