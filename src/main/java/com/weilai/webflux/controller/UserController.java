package com.weilai.webflux.controller;

import com.weilai.webflux.entity.User;
import com.weilai.webflux.service.UserService;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author weilai
 * @email 352342845@qq.com
 * @date 2019-06-21 18:09
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public Flux<User> get() {
        return userService.findAll();
    }

    @GetMapping("/getUser")
    public Mono<User> get(String userName, String passWord) {
        return userService.getUser(userName, passWord);
    }

    @GetMapping("/add")
    public Mono<Integer> add() {
        String name = RandomString.make(10);
        String country = "USA";
        return userService.add(name, country).map(User::getId);
    }
}
