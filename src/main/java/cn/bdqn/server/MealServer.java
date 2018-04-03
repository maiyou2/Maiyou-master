package cn.bdqn.server;

import cn.bdqn.entity.Meal;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface MealServer {
    public Integer addMeal(Meal meal);
    public PageInfo<Meal> queryAll(Integer pageNum, Integer pageSize);
    public Integer deleteMealById(Integer mealid);
   // public Integer deleteGradeByIds(List<Integer> mealids);
}
