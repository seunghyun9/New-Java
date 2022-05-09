package kr.co.clozet.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Entity
@Component
@Table(name="schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String STADIUM_ID;
    private String SCHE_DATE;
    private String GUBUN;
    private String HONETEAM_ID;
    private String AWAYTEAM_ID;
    private String HOME_SCORE;
    private String AWAY_SCORE;
}
