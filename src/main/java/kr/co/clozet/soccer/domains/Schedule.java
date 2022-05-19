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
@Table(name = "schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long scheduleNo;
    @Column(nullable = false) private String scheduleId;
    @Column @NotNull private String scheDate;
    @Column @NotNull private String gubun;
    @Column @NotNull private String homeTeamid;
    @Column @NotNull private String awayTeamid;
    @Column @NotNull private String homeScore;
    @Column @NotNull private String awayScore;

    @ManyToOne
    @JoinColumn(name="stadium_no")
    private Stadium stadium;

}
