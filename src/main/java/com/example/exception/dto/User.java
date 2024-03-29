package com.example.exception.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
//ddddd
    @NotEmpty
    @Size(min=1, max=10)
    private String name;

    @Min(1)
    @NotNull
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    // push 연습
    // 이클립스하고 어떤 부분이 다른거지?
    // 이클립스 일단대기.... 이클립스에서 인텔리제이로 pull 가능??
    // git test
}
