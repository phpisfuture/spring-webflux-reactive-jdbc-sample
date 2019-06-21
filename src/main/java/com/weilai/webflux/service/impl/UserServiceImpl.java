package com.weilai.webflux.service.impl;

import com.weilai.webflux.entity.User;
import com.weilai.webflux.repository.UserDao;
import com.weilai.webflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;

/**
 * @author weilai
 * @email 352342845@qq.com
 * @date 2019-06-20 15:47
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Autowired
    private Scheduler jdbcScheduler;


    @Override
    public Mono<User> getUser(String userName, String passWord) {
        return Mono
                .defer(() -> Mono.just(this.userDao.findByUserNameAndPassWord(userName, passWord)))
                .subscribeOn(jdbcScheduler);
    }

    @Override
    public Flux<User> findAll() {
        Flux<User> defer = Flux.defer(() -> Flux.fromIterable(this.userDao.findAll()));
        return defer.subscribeOn(jdbcScheduler);
    }

    @Override
    public Mono<User> add(String userName, String passWord) {
        return Mono.fromCallable(() -> transactionTemplate.execute(status -> {
            User user = new User();
            user.setUserName("weilai");
            user.setPassWord("cool");
            return userDao.save(user);
        })).subscribeOn(jdbcScheduler);
    }


}
