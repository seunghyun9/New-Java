package kr.co.clozet.soccer.services;

import kr.co.clozet.soccer.domains.Stadium;
import kr.co.clozet.soccer.repositories.StadiumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class StadiumServiceImpl implements StadiumService{

    private final StadiumRepository repository;

    @Override
    public List<Stadium> findAll() {
        return null;
    }

    @Override
    public List<Stadium> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Stadium> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public String put(Stadium stadium) {
        return null;
    }

    @Override
    public String delete(Stadium stadium) {
        return null;
    }

    @Override
    public String save(Stadium stadium) {
        return null;
    }

    @Override
    public Optional<Stadium> findById(String stadiumid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String stadiumid) {
        return false;
    }

    @Override
    public List<Stadium> findByStadiumName(String name) {
        return null;
    }
}
