package cn.bdqn.dao;

import cn.bdqn.entity.Admin;

import java.util.List;

/**
 * Created by zhang on 2018/3/20.
 */
public interface AdminMapper {
    //查全部user
    public List<Admin> queryAllAdmin();
    //通过id查user
    public Admin queryAdminById(Integer id);
    //通过用户Id级别修改
    public Integer updateAdminByAdminRank(Admin admin);
    //假删除用户id 通过修改visbble
    public Integer updateAdminByAdminId(Integer adminId);
    public Admin AdminLogin(Admin admin);


}
