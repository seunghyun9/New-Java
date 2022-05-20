package kr.co.clozet.board.services;

import kr.co.clozet.board.domains.Board;
import kr.co.clozet.board.repositories.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository repository;
    @Override
    public List<Board> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Board> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Board> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String delete(Board board) {
        repository.delete(board);
        return "";
    }

    @Override
    public String save(Board board) {
        repository.save(board);
        return "";
    }
}
