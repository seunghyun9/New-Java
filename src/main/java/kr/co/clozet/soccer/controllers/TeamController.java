package kr.co.clozet.soccer.controllers;

import kr.co.clozet.auth.domains.User;
import kr.co.clozet.soccer.domains.Team;
import kr.co.clozet.soccer.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName:kr.co.clozet.soccer.controllers
 * fileName        :TeamController.java
 * author          : kimseunghyun
 * date            :2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09           kimseunghyun      최초 생성
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping("/teams")
public class TeamController {

    private final TeamService service;

    @PutMapping("/put")
    public String put(@RequestBody Team team) {
        return service.put(team);
    }

    // Embeded Method
    @GetMapping("/findAll")
    public List<Team> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Team> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Team> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Team team) {
        return service.delete(team);
    }

    @PostMapping("/join")
    public String save(@RequestBody Team team) {
        return service.save(team);
    }

    @GetMapping("/findById/{teamid}")
    public Optional<Team> findById(@PathVariable String teamid) {
        return service.findById(teamid);
    }

    @GetMapping("/existsById/{teamid}")
    public boolean existsById(@PathVariable String teamid) {
        return service.existsById(teamid);
    }


}
