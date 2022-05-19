package kr.co.clozet.board.services;

import kr.co.clozet.board.domains.Article2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ArticleService  {

    List<Article2> findAll();

    List<Article2> findAll(Sort sort);

    Page<Article2> findAll(Pageable pageable);

    long count();

    String delete(Article2 article);

    String save(Article2 article);


    boolean existsById(String id);

    Optional<Article2> findById(String id);
}
