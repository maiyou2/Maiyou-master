package cn.bdqn.server;

import cn.bdqn.entity.CheckInformation;
import cn.bdqn.vo.OrderFormVo;
import com.github.pagehelper.PageInfo;

/**
 * Created by wenzhichao on 2018/3/20.
 */
public interface OrderFormService {
    //查询全部页面
    PageInfo<OrderFormVo> queryAllOrderForm(Integer pageNum, Integer pageSize);
    //假删除
    Integer deleteOrderForm(Integer id);
    //详情
    OrderFormVo queryOrderFormVoById(Integer id);
    //修改
    Integer updateOrderForm(CheckInformation checkInformation);
}
