package kr.co.clozet.board.repositories;

import kr.co.clozet.board.domains.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:kr.co.clozet.board.repositories
 * fileName        :ArticleRepository.java
 * author          : kimseunghyun
 * date            :2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09           kimseunghyun      최초 생성
 **/

interface ArticleCustomRepository{
    // 000. title 과 content 를 수정하시오
    void update(Article article);
}


@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
