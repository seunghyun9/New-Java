package kr.co.clozet.soccer.services;

import kr.co.clozet.soccer.domains.Stadium;
import kr.co.clozet.soccer.repositories.StadiumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StadiumServiceImpl implements StadiumService{
    private final StadiumRepository repository;

    @Override
    public String login(Stadium stadium) {
        return null;
    }

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
}
