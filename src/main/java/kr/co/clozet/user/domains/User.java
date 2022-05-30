package kr.co.clozet.user.domains;

import com.sun.istack.NotNull;
import kr.co.clozet.board.domains.Article;
import kr.co.clozet.closet.domains.Closet;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName:kr.co.clozet.domains
 * fileName        :User.java
 * author          : kimseunghyun
 * date            :2022-05-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-03           kimseunghyun      최초 생성
 **/
@ToString
@Setter // modelMapper 를 사용하기 위해

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
// 컴포넌트는 프로퍼티와 메소드의 집합
@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue private long userId;
    @Column private @NotNull String username;
    @Column private @NotNull String password;
    @Column private @NotNull String name;
    @Column private @NotNull String birth;
    @Column private @NotNull String nickname;
    @Column private @NotNull String email;
    @Column private @NotNull String phone;

    @OneToMany(mappedBy = "user")
    List<Article> articles = new ArrayList<>();

    @OneToOne(mappedBy = "user")
    private Closet closet;

    @ElementCollection(fetch = FetchType.EAGER)
    public List<Role> roles;


}
