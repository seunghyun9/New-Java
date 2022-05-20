package kr.co.clozet.soccer.repositories;

import kr.co.clozet.soccer.domains.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:kr.co.clozet.soccer.repositories
 * fileName        :StadiumRepository.java
 * author          : kimseunghyun
 * date            :2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09           kimseunghyun      최초 생성
 **/
interface StadiumCustomRepository{

}

@Repository
public interface StadiumRepository extends JpaRepository<Stadium, Long>, StadiumCustomRepository{
}
