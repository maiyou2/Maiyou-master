package cn.bdqn.entity;

import javax.xml.soap.Text;

/**
 * Created by zhibai on 2018/3/19.
 * foodId 主键
 * foodName 美食名称
 * foodType 美食类型
 * foodSale 美食价格
 * foodPhoto 美食图片
 */
public class Food {
    private int foodId,visbble;
    private  String foodName ,foodType;
    private  double foodSale;
    private Text foodPhoto;

    @Override
    public String toString() {
        return "Food{" +
                "foodId=" + foodId +
                ", visbble=" + visbble +
                ", foodName='" + foodName + '\'' +
                ", foodType='" + foodType + '\'' +
                ", foodSale=" + foodSale +
                ", foodPhoto=" + foodPhoto +
                '}';
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public int getVisbble() {
        return visbble;
    }

    public void setVisbble(int visbble) {
        this.visbble = visbble;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public double getFoodSale() {
        return foodSale;
    }

    public void setFoodSale(double foodSale) {
        this.foodSale = foodSale;
    }

    public Text getFoodPhoto() {
        return foodPhoto;
    }

    public void setFoodPhoto(Text foodPhoto) {
        this.foodPhoto = foodPhoto;
    }
}
