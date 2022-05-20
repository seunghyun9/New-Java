package kr.co.clozet.soccer.services;

import kr.co.clozet.soccer.domains.Team;
import kr.co.clozet.soccer.repositories.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamRepository repository;

    @Override
    public List<Team> findAll() {
        return null;
    }

    @Override
    public List<Team> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Team> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public String put(Team team) {
        return null;
    }

    @Override
    public String delete(Team team) {
        return null;
    }

    @Override
    public String save(Team team) {
        return null;
    }

    @Override
    public Optional<Team> findById(String teamid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String teamid) {
        return false;
    }

    @Override
    public List<Team> findByTeamName(String name) {
        return null;
    }
}
