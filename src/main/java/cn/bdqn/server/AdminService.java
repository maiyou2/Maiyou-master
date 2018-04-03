package cn.bdqn.server;

import cn.bdqn.entity.Admin;
import com.github.pagehelper.PageInfo;

/**
 * Created by zhang on 2018/3/20.
 */
public interface AdminService {
    //查全部user
    public PageInfo<Admin> queryAllAdmin(Integer pageNum, Integer pageSize);
    //通过id查user
    public Admin queryAdminById(Integer id);
    //通过用户级别修改
    public Integer updateAdminByAdminRank(Admin admin);
    public Integer updateAdminByAdminId(Integer adminId);
    public Admin AdminLogin(Admin admin);
}
