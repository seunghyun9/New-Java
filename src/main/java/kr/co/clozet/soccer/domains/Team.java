package kr.co.clozet.soccer.domains;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
@Entity
@Table(name = "teams")
public class Team {
    @Id
    @Column(name="team_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long teamNo;
    @Column(nullable = false) private String teamId;
    @Column(nullable = false) private String stadiumId;
    @Column private @NotNull String regionName;
    @Column private @NotNull String teamName;
    @Column private @NotNull String eTeamName;
    @Column private @NotNull String orig;
    @Column private @NotNull String zipCode1;
    @Column private @NotNull String zipCode2;
    @Column private @NotNull String address;
    @Column private @NotNull String ddd;
    @Column private @NotNull String tel;
    @Column private @NotNull String fax;
    @Column private @NotNull String homepage;
    @Column private @NotNull String owner;

    @OneToMany(mappedBy = "team")
    List<Player> players = new ArrayList<>();
}
