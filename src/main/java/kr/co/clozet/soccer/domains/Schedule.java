package kr.co.clozet.soccer.domains;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName:kr.co.clozet.soccer.domains
 * fileName        :Schedule.java
 * author          : kimseunghyun
 * date            :2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09           kimseunghyun      최초 생성
 **/
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name="schedules")
public class Schedule {

    @Id
    @Column(name = "schedule_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long scheduleNo;
    private String scheDate;
    private String gubun;
    private String hometeamId;
    private String awayteamId;
    private String homeScore;
    private String awayScore;
    private String stadiumId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_no")
    private Stadium stadium;

}
