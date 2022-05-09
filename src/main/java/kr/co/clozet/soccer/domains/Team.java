package kr.co.clozet.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Entity
@Component
@Table(name="team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String TEAM_ID;
    private String REGION_NAME;
    private String TEAM_NAME;
    private String E_TEAM_NAME;
    private String ORIG_YYYY;
    private String STADIUM_ID;
    private String ZIP_CODE1;
    private String ZIP_CODE2;
    private String ADDRESS;
    private String DDD;
    private String TEL;
    private String FAX;
    private String HOMEPAGE;
    private String OWNER_NAME;
}
