package kr.co.clozet.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Entity
@Component
@Table(name="player")

public class Player {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String PLAYER_ID;
    private String PLAYER_NAME;
    private String TEAM_ID;
    private String E_PLAYER_NAME;
    private String NICKNAME;
    private String JOIN_YYYY;
    private String BIRTH_DATE;
    private String SOLAR;
    private String HEIGHT;
    private String WEIGHT;
}
