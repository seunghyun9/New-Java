package kr.co.clozet.auth.domains;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component // 컴포넌트는 프로퍼티와 메소드의 집합이다.
@Entity
@Eager //Lazy의 반대말 즉시실행을 의미
@Table(name="users")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue private long userId;
    @Column private @NotNull String username;
    @Column private @NotNull String password;
    @Column private @NotNull String name;
    @Column private @NotNull String email;
    @Column(name = "reg_date") @NotNull private String regDate;

    @OneToMany(mappedBy = "u")
    List<Article> articles = new ArrayList<>();
    // lIST가 ALL의 의미를 갖는다 ex) findall의 리턴타입은 오직 LIST
}




    /**
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //랜덤으로 숫자를만들고 유니크하게 만듬
    private Long id;
    @Column(nullable = false) private String userid; // null값은 안됨
    @Column(nullable = false) private String password;
    @Column(nullable = false) private String email;
    @Column(nullable = false) private String name;
    private String phone;
    private String birth;
    private String address;
     **/