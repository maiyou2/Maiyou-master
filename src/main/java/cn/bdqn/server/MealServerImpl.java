package cn.bdqn.server;

import cn.bdqn.dao.MealMapper;
import cn.bdqn.entity.Meal;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MealServerImpl implements MealServer {
    @Resource
    private MealMapper mealMapper;
    public Integer addMeal(Meal meal) {
        return mealMapper.addMeal(meal);
    }

    public PageInfo<Meal> queryAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Meal> list=mealMapper.queryAll();
        PageInfo<Meal>pageInfo=new PageInfo<Meal>(list);
        return pageInfo;
    }

    public Integer deleteMealById(Integer mealid) {
        return mealMapper.deleteMealById(mealid);
    }

//    public Integer deleteGradeByIds(List<Integer> mealids) {
//        return mealMapper.deleteGradeByIds(mealids);
//    }
}
