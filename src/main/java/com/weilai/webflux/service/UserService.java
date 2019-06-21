package com.weilai.webflux.service;

import com.weilai.webflux.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author weilai
 * @email 352342845@qq.com
 * @date 2019-06-20 15:42
 */
public interface UserService {

    Flux<User> findAll();

    Mono<User> getUser(String userName, String passWord);

    Mono<User> add(String userName, String passWord);
}
