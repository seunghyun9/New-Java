package kr.co.clozet.auth.services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import kr.co.clozet.auth.domains.User;

import java.util.List;
import java.util.Optional;

//인터페이스는 추상메소드만 가지고 있다.
public interface UserService {
    String login(User user);

    List<User> findAll();

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);

    long count();

    String put(User user);

    String delete(User user);

    String save(User user);

    Optional<User> findById(String userid);

    boolean existsById(String userid);

    //custom
    List<User> findByUserName(String name);
}
