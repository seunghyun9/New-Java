package kr.co.clozet.closet.domains;

import kr.co.clozet.user.domains.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName:kr.co.clozet.closet.domains
 * fileName        :Closet.java
 * author          : kimseunghyun
 * date            :2022-05-29
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-29           kimseunghyun      최초 생성
 **/
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name="closets")
public class Closet {
    @Id
    @Column(name = "closet_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long closetId;
    @Column private String clothesClassification;

    @OneToMany(mappedBy = "closet")
    List<Clothes> clothes = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;


}
