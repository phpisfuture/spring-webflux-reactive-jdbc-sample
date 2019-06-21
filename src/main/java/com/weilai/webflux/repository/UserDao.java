package com.weilai.webflux.repository;

import com.weilai.webflux.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author weilai
 * @email 352342845@qq.com
 * @date 2019-06-20 15:50
 */
@Repository
public interface UserDao extends CrudRepository<User, Integer> {

    User findByUserNameAndPassWord(String userName, String passWord);
}
