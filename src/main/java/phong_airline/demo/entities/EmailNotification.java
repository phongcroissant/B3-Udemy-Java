package phong_airline.demo.entities;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "email_notifications")
@AllArgsConstructor
@NoArgsConstructor
public class EmailNotifiaction {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String subject;

    @NotBlank(message="recipient is required")
    private String recipientEmail;

    @Lob
    private String body;

    @ManyToOne
    @JoinColumn(name="booking_id")
    private Booking bokking;

    private LocalDateTime sentAt;

    private boolean isHtml;
}
