package kr.co.clozet.auth.controllers;
import kr.co.clozet.auth.services.UserService;
import kr.co.clozet.auth.domains.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController // 컴포넌트 표시
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping("/login")
    public String login(@RequestBody User user){
        return service.login(user);
    }

    @GetMapping("/logout")
    public String logout(){return "";}

    @GetMapping("/findAll")
    public List<User> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<User> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<User> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @PutMapping("/put")
    public String put (@RequestBody User user){
        return service.put(user);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody User user) {return service.delete(user);}

    @PostMapping("/join")
    public String save(@RequestBody User user) {return service.save(user);}

    @GetMapping("/findById/{userid}") // {} userid 라는변수값 처리
    public Optional<User> findById(@PathVariable String userid) {
        return service.findById(userid);
    }
    @GetMapping("/existsById/{userid}")
    public boolean existsById(@PathVariable String userid) {
        return service.existsById(userid);
    }
}
