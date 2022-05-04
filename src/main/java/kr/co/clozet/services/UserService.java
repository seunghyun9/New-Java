package kr.co.clozet.services;

import kr.co.clozet.domains.User;

import java.util.List;

//인터페이스는 추상메소드만 가지고 있다.
public interface UserService {
    String login(User user);

    List<User> findAll();
}
