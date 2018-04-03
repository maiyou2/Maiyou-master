package cn.bdqn.server;

import cn.bdqn.dao.OrderFormMapper;
import cn.bdqn.entity.CheckInformation;
import cn.bdqn.vo.OrderFormVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wenzhichao on 2018/3/20.
 */
@Service
public class OrderFormServiceImpl implements OrderFormService {
    @Resource
    private OrderFormMapper orderFormMapper;

//查询所有

    public PageInfo<OrderFormVo> queryAllOrderForm(Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        List<OrderFormVo> orderFormVos = orderFormMapper.queryAllOrderForm();
        PageInfo<OrderFormVo> pageInfo = new PageInfo<OrderFormVo>(orderFormVos);
        return pageInfo;
    }
//假删除

    public Integer deleteOrderForm(Integer id) {
        return orderFormMapper.deleteOrderForm(id);
    }

//详情
    public OrderFormVo queryOrderFormVoById(Integer id) {
        return orderFormMapper.queryOrderFormVoById(id);
    }
    //修改
    public Integer updateOrderForm(CheckInformation checkInformation) {
        return orderFormMapper.updateOrderForm(checkInformation);
    }


}
