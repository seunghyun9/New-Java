package kr.co.clozet.board.controllers;

import kr.co.clozet.board.domains.Article2;
import kr.co.clozet.board.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/article")
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService service;
    @GetMapping("/findAll")
    public List<Article2> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Article2> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Article2> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Article2 article) {
        return service.delete(article);
    }

    @PostMapping("/join")
    public String save(@RequestBody Article2 article) {
        return service.save(article);
    }

    @GetMapping("/findById/{id}")
    public Optional<Article2> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @GetMapping("/existsById/{id}")
    public boolean existsById(@PathVariable String id) {
        return service.existsById(id);
    }

}
