package kr.co.clozet.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Component
@Entity
@Table(name="stadiums")
public class Stadium {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String STADIUM_ID;
    private String STADIUM_NAME;
    private String HOMETEAM_ID;
    private String SEAT_COUNT;
    private String ADDRESS;
    private String DDD;
    private String TEL;
}
