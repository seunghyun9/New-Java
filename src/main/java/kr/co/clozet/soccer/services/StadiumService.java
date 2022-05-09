package kr.co.clozet.soccer.services;

import kr.co.clozet.soccer.domains.Stadium;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface StadiumService {
    String login(Stadium stadium);

    List<Stadium> findAll();
    List<Stadium> findAll(Sort sort);


    Page<Stadium> findAll(Pageable pageable);

    long count();

    String put(Stadium stadium);

    String delete(Stadium stadium);

    String save(Stadium stadium);
}
