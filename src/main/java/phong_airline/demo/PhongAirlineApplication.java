package phong_airline.demo;

// import java.nio.charset.StandardCharsets;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;
// import org.springframework.mail.javamail.JavaMailSender;
// import org.springframework.mail.javamail.MimeMessageHelper;

// import jakarta.mail.internet.MimeMessage;

@SpringBootApplication
public class PhongAirlineApplication {

	// @Autowired
	// private JavaMailSender javaMailSender;

	public static void main(String[] args) {
		SpringApplication.run(PhongAirlineApplication.class, args);
	}

	// @Bean
	// CommandLineRunner runner() {
	// 	return args-> {
	// 		try {
	// 			MimeMessage mimeMessage = javaMailSender.createMimeMessage();
	// 			MimeMessageHelper helper= new MimeMessageHelper(mimeMessage, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED, StandardCharsets.UTF_8.name());
	// 			helper.setTo("eycesan.is0@gmail.com");
	// 			helper.setSubject("Test Mail");
	// 			helper.setText("Test mail corps");
	// 			helper.setFrom("phongnguyen25000@gmail.com");

	// 			System.out.println("About to send Email...");
	// 			javaMailSender.send(mimeMessage);
	// 		} catch (Exception e) {
	// 			System.out.println(e.getMessage());
	// 		}
	// 		System.out.println("TEST RUNNER DONE ✅");

	// 	};
		
	// }
}
