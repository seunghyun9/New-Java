package kr.co.clozet.soccer.services;


import kr.co.clozet.auth.domains.User;
import kr.co.clozet.soccer.domains.Stadium;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName:kr.co.clozet.soccer.services
 * fileName        :StadiumService.java
 * author          : kimseunghyun
 * date            :2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09           kimseunghyun      최초 생성
 **/
public interface StadiumService {

    List<Stadium> findAll();

    List<Stadium> findAll(Sort sort);

    Page<Stadium> findAll(Pageable pageable);

    long count();

    String put(Stadium stadium);

    String delete(Stadium stadium);

    String save(Stadium stadium);

    Optional<Stadium> findById(String stadiumid);

    boolean existsById(String stadiumid);

    // custom
    List<Stadium> findByStadiumName(String name);
}
