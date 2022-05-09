package kr.co.clozet.soccer.controllers;



import kr.co.clozet.soccer.domains.Stadium;
import kr.co.clozet.soccer.services.StadiumService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stadium")
@RequiredArgsConstructor

public class StadiumController {
    private final StadiumService service;
    @PostMapping("/login")
    public String login(@RequestBody Stadium stadium){
        return service.login(stadium);
    }
    @GetMapping("/logout")
    public String logout(){return "";}

    @GetMapping("/findAll")
    public List<Stadium> findAll() {
        return service.findAll();
    }
    @GetMapping("/findAll/sort")
    public List<Stadium> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Stadium> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @PutMapping("/put")
    public String put (@RequestBody Stadium stadium){
        return service.put(stadium);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Stadium stadium) {return service.delete(stadium);}

    @PostMapping("/join")
    public String save(@RequestBody Stadium stadium) {return service.save(stadium);}

}
