package com.example.exception.controller;

import com.example.exception.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class ApiController {

    @GetMapping("")
    public User get(@RequestParam(required = false) String name, Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);

        int a = 10+age;

        return user;
    }

    @PostMapping("")
    public User post(@RequestBody User user) {

        System.out.println(user);
        return user;
    }

    // exception 사례 알아보기
    // Spring legacy  와 spring boot 비교
    //어노테이션 추가
}
