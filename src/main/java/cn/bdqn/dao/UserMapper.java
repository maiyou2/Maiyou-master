package cn.bdqn.dao;

import cn.bdqn.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 */
public interface UserMapper {
    List<User> queryAll();

    User queryUserById(Integer id);

    Integer updateUserById(Integer id);

    Integer deleteUserById(Integer id);


}
