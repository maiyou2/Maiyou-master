package cn.bdqn.dao;

import cn.bdqn.entity.CheckInformation;
import cn.bdqn.vo.OrderFormVo;

import java.util.List;


/**
 * Created by wenzhichao on 2018/3/20.
 */
public interface OrderFormMapper {
//查询全部页面
    List<OrderFormVo> queryAllOrderForm();
//假删除
    Integer deleteOrderForm(Integer id);

    //详情
    OrderFormVo queryOrderFormVoById(Integer id);

    //修改
    Integer updateOrderForm(CheckInformation CheckInformation);


}
