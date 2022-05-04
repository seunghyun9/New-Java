package kr.co.clozet.controllers;
import kr.co.clozet.domains.User;
import kr.co.clozet.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
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
    public String logout(){
        return "";
    }
    @PostMapping("/findAll")
    public List<User> findAll(@RequestBody User user) {
        service.findAll(pageable);
    }
    @GetMapping("/findAll/sort")
    public List<User> findAll(Sort sort) {
        return null;
    }
    @GetMapping("/findAll/pageable")
    public Page<User> findAll(Pageable pageable) {
        return null;
    }
    @GetMapping("/count")
    public long count() {
        return 0;
    }
    @PutMapping("/put")
    public void put (@RequestBody User user){
        return;
    }
    @DeleteMapping("/delete")
    public void delete(@RequestBody User user) {

    }
    @PostMapping("/join")
    public String save(@RequestBody User user) {
        service.save(user);
        return "";
    }
    @GetMapping("/findById/{userid}") // {} userid 라는변수값 처리
    public Optional<User> findById(@PathVariable String userid) {
        return service.findById(userid);
    }
    @GetMapping("/existsById/{userid}")
    public boolean existsById(@PathVariable String userid) {
        return false;
    }
    @GetMapping("/getOne/{id}")
    public User getOne(@PathVariable Long id) {
        return null;
    }
}
