package kr.co.clozet.soccer.repositories;

import kr.co.clozet.soccer.domains.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * packageName:kr.co.clozet.soccer.repositories
 * fileName        :TeamRepository.java
 * author          : kimseunghyun
 * date            :2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09           kimseunghyun      최초 생성
 **/
interface TeamCustomRepository{
    // 000. 팀의 전화번호와 팩스번호를 수정하시오
    @Query(value="update team t set t.tel = :tel, t.fax = :fax where t.teamNo = :teamNo",
            nativeQuery = true)
    int update(@Param("tel") String tel, @Param("fax") String fax);

    // 001. 전체 축구팀 목록을 팀이름 오름차순으로 출력하시오
    @Query(value="select t.teamName as teamName from team t order by t.teamName",
            nativeQuery = true)
    List<String> findTeamNamesAsc();

    // 005-2. 수원팀의 ID는 ?

}

@Repository
public interface TeamRepository extends JpaRepository<Team, Long>, TeamCustomRepository{


}
