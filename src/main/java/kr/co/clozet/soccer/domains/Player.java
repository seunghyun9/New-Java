package kr.co.clozet.soccer.domains;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
@Entity
@Table(name = "players")
public class Player {
    @Id
    @Column(name="player_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long playerNo;
    @Column(nullable = false) private String playerId;
    @Column(nullable = false) private String playerName;
    @Column private @NotNull String ePlayerName;
    @Column private @NotNull String nickname;
    @Column private @NotNull String joinYyyy;
    @Column private @NotNull String position;
    @Column private @NotNull String backNo;
    @Column private @NotNull String nation;
    @Column private @NotNull String birthDate;
    @Column private @NotNull String solar;
    @Column private @NotNull String height;
    @Column private @NotNull String weight;
    @ManyToOne
    @JoinColumn(name="team_no")
    private Team team;
}
