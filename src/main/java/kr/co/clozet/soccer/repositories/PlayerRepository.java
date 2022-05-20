package kr.co.clozet.soccer.repositories;

import kr.co.clozet.soccer.domains.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:kr.co.clozet.soccer.repositories
 * fileName        :PlayerRepository.java
 * author          : kimseunghyun
 * date            :2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09           kimseunghyun      최초 생성
 **/
interface PlayerCustomRepository{

}

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>, PlayerCustomRepository{
}
