package cn.bdqn.controller;

import cn.bdqn.entity.User;
import cn.bdqn.server.UserService;
import cn.bdqn.util.Message;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/3/20.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("toUser")
    public String toUser(Integer pageNum, Integer pageSize, Model model){
        PageInfo<User> pageInfo = userService.queryAll(pageNum, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        return "yonghuliebiao";
    }
    @ResponseBody
    @RequestMapping(value = "queryUserById", method = RequestMethod.GET,
        produces = {"application/json;charset=utf-8"})
    public String queryUserById(Integer id){
        User user = userService.queryUserById(id);
        return JSON.toJSONString(user);
    }
    @ResponseBody
    @RequestMapping(value = "updateUserById",method = RequestMethod.POST,
        produces = {"application/json;charset=utf-8"})
    public String updateUserById(Integer id){
        int n = userService.updateUserById(id);
        if(n>0){
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }
    @ResponseBody
    @RequestMapping(value = "deleteUserById",method = RequestMethod.GET,
        produces = {"application/json;charset=utf-8"})
    public String deleteUserById(Integer id){
        int n = userService.deleteUserById(id);
        if(n>0){
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }
}
