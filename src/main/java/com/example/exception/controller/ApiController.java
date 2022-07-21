package com.example.exception.controller;

import com.example.exception.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class ApiController {

    @GetMapping("")
    public User get(@RequestParam(required = false) String name,@RequestParam(required = false) Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);

        int a = 10+age;

        return user;
    }

    @PostMapping("")
    public User post(@Valid @RequestBody User user) {

        System.out.println(user);
        return user;
    }


    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException e){
        System.out.println("api controller");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }


    // exception 사례 알아보기
    // Spring legacy  와 spring boot 비교
    //  어노테이션 추가


    // dependency 작성 차이법 ( legacy, boot)

    // Postman 활용해보기

    // 초기환경설정 및 DB연동

    // listener 설정
    //new dev branch
    int a = 10;
    //login 작업
}
