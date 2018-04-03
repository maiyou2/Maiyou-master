package cn.bdqn.dao;

import cn.bdqn.entity.Meal;

import java.util.List;

public interface MealMapper {
    public Integer addMeal(Meal meal);
    public Integer deleteMealById(Integer mealid);
    public List<Meal> queryAll();
  //  public Integer deleteGradeByIds(List<Integer> mealids);
}
