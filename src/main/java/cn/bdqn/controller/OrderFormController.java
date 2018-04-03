package cn.bdqn.controller;

import cn.bdqn.entity.CheckInformation;
import cn.bdqn.server.OrderFormService;
import cn.bdqn.util.Message;
import cn.bdqn.vo.OrderFormVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by wenzhichao on 2018/3/21.
 */
@Controller
@RequestMapping("orderForm")
public class OrderFormController {

    @Resource
    private OrderFormService orderFormService;
    //查所有
    @RequestMapping("orderFormList")
    public String orderFormList(Integer pageNum, Integer pageSize, Model model){

        PageInfo<OrderFormVo> pageInfo = orderFormService.queryAllOrderForm(pageNum, pageSize);

        model.addAttribute("pageInfo", pageInfo);
        return "dingdanliebiao";
    }

    //假删除
    @ResponseBody
    @RequestMapping(value = "orderFormDelete",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    public String orderFormDelete(Integer id){
        Integer n = orderFormService.deleteOrderForm(id);
        if(n>0){
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());

    }

    //详情
    @ResponseBody
    @RequestMapping(value = "orderFormById",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public String orderFormById(Integer id){
        OrderFormVo orderFormVo = orderFormService.queryOrderFormVoById(id);
        return JSON.toJSONString(orderFormVo);
    }

    //修改
    @ResponseBody
    @RequestMapping(value = "updateOrderForm",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public String updateOrderForm(CheckInformation checkInformation, Model model) {

        Integer n = orderFormService.updateOrderForm(checkInformation);
        if(n>0){

            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());


    }

}
