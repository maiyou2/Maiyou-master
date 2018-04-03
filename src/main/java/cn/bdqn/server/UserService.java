package cn.bdqn.server;

import cn.bdqn.entity.User;
import com.github.pagehelper.PageInfo;

/**
 * Created by Administrator on 2018/3/20.
 */
public interface UserService {
    PageInfo<User> queryAll(Integer pageNum, Integer pageSize);

    User queryUserById(Integer id);

    Integer updateUserById(Integer id);

    Integer deleteUserById(Integer id);
}
