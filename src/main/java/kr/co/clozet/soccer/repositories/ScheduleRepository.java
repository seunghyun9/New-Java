package kr.co.clozet.soccer.repositories;

import kr.co.clozet.soccer.domains.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * packageName:kr.co.clozet.soccer.repositories
 * fileName        :ScheduleRepository.java
 * author          : kimseunghyun
 * date            :2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09           kimseunghyun      최초 생성
 **/
interface ScheduleCustomRepository{
    // 000. 스케줄 날짜만 수정이 되도록 하시오
    @Query(value = "update schedule sc set sc.scheDate = :scheDate where sc.scheduleNo = :scheduleNo",
            nativeQuery = true)
    int update(@Param("scheDate") String scheDate);

}

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long>{
}
