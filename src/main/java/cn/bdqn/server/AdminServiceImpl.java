package cn.bdqn.server;

import cn.bdqn.dao.AdminMapper;
import cn.bdqn.entity.Admin;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhang on 2018/3/20.
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;
    public PageInfo<Admin> queryAllAdmin(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Admin> admins=adminMapper.queryAllAdmin();
        PageInfo<Admin> pageInfo=new PageInfo<Admin>(admins);
        return pageInfo;
    }

    public Admin queryAdminById(Integer id) {

        return adminMapper.queryAdminById(id);
    }

    public Integer updateAdminByAdminRank(Admin admin) {

        return adminMapper.updateAdminByAdminRank(admin);
    }

    public Integer updateAdminByAdminId(Integer adminId) {

        return adminMapper.updateAdminByAdminId(adminId);
    }

    public Admin AdminLogin(Admin admin) {

        return adminMapper.AdminLogin(admin);
    }


}
