package kr.co.clozet.auth.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Component // 컴포넌트는 프로퍼티와 메소드의 집합이다.
@Entity
@Table(name="users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //랜덤으로 숫자를만들고 유니크하게 만듬
    private Long id;
    @Column(nullable = false) private String userid; // null값은 안됨
    @Column(nullable = false) private String password;
    @Column(nullable = false) private String email;
    @Column(nullable = false) private String name;
    private String phone;
    private String birth;
    private String address;
}
