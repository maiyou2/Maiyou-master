package cn.bdqn.server;

import cn.bdqn.dao.UserMapper;
import cn.bdqn.entity.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    public PageInfo<User> queryAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> list = userMapper.queryAll();
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        return pageInfo;
    }

    public User queryUserById(Integer id) {
        return userMapper.queryUserById(id);
    }

    public Integer updateUserById(Integer id) {
        return userMapper.updateUserById(id);
    }

    public Integer deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }
}
