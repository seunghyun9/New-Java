package kr.co.clozet.domains;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component // 컴포넌트는 프로퍼티와 메소드의 집합이다.
public class User {
    private String password;
    private String email;
    private String name;
    private String phone;
    private String birth;
    private String address;

}
