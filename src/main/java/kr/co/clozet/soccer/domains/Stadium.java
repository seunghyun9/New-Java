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
@Table(name = "stadiums")
public class Stadium {
    @Id
    @Column(name="stadium_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long stadiumNo;
    @Column(nullable = false) private String stadiumId;
    @Column private @NotNull String stadiumName;
    @Column private @NotNull String homeTeamId;
    @Column private @NotNull String seatCount;
    @Column private @NotNull String address;
    @Column private @NotNull String ddd;
    @Column private @NotNull String tel;

    @OneToMany(mappedBy = "stadium")
    List<Schedule> schedules = new ArrayList<>();
}
