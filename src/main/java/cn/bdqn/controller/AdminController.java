package cn.bdqn.controller;

import cn.bdqn.entity.Admin;
import cn.bdqn.server.AdminService;
import cn.bdqn.util.Message;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by zhang on 2018/3/20.
 */
@Controller
@RequestMapping("admin")
public class AdminController {
    @Resource
    private AdminService adminService;
    @RequestMapping(value = "login",method = RequestMethod.POST,
            produces = {"application/json;charset=utf-8"})
    public String toAdminLogin(Admin admin,HttpSession session,Model model){
        Admin loginAdmin=adminService.AdminLogin(admin);
        session.setAttribute("loginAdmin",loginAdmin);
        if(loginAdmin!=null){
            return "main";
        }else{
            model.addAttribute("message", "用户名或密码错误");
            return "index";
        }

    }
    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.removeAttribute("loginAdmin");
        return "index";
    }
    @RequestMapping("queryAllAdmin")
    public String queryAllAdmin(Integer pageNum, Integer pageSize, HttpSession session, Model model){
        PageInfo<Admin> pageInfo=adminService.queryAllAdmin(pageNum,pageSize);
        model.addAttribute("pageInfo",pageInfo);

        return "quanxianguanli";
    }
    @ResponseBody
    @RequestMapping(value = "queryAdminById",method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    public String queryAdminById(Integer id){
        Admin admin=adminService.queryAdminById(id);

        return JSON.toJSONString(admin);

    }
    @ResponseBody
    @RequestMapping(value = "updateAdminByAdminRank",method = RequestMethod.POST,
            produces = {"application/json;charset=utf-8"})
    public String updateAdminByAdminRank(Admin admin){

           Integer n=adminService.updateAdminByAdminRank(admin);
           if(n>0){
               return JSON.toJSONString(Message.success());

           }else{
               return JSON.toJSONString(Message.error());
           }
    }
    @ResponseBody
    @RequestMapping(value = "updateAdminByAdminId",method = RequestMethod.POST,
            produces = {"application/json;charset=utf-8"})
    public String updateAdminByAdminId(Integer adminId){
        Integer n=adminService.updateAdminByAdminId(adminId);
        if(n>0){
            return JSON.toJSONString(Message.success());
        }else{

            return JSON.toJSONString(Message.error());
        }
    }

}
