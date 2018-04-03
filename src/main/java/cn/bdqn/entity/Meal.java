package cn.bdqn.entity;

public class Meal {
    private int mealid,visbble;
    private String meal;
    private String mealprice;
    private String mealhotel;
    private String mealair;
    private String mealsettime;
    private String mealphoto;
    private String mealxiang;

    public Meal() {
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealid=" + mealid +
                ", visbble=" + visbble +
                ", meal='" + meal + '\'' +
                ", mealprice='" + mealprice + '\'' +
                ", mealhotel='" + mealhotel + '\'' +
                ", mealair='" + mealair + '\'' +
                ", mealsettime='" + mealsettime + '\'' +
                ", mealphoto='" + mealphoto + '\'' +
                ", mealxiang='" + mealxiang + '\'' +
                '}';
    }

    public int getMealid() {
        return mealid;
    }

    public void setMealid(int mealid) {
        this.mealid = mealid;
    }

    public int getVisbble() {
        return visbble;
    }

    public void setVisbble(int visbble) {
        this.visbble = visbble;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getMealprice() {
        return mealprice;
    }

    public void setMealprice(String mealprice) {
        this.mealprice = mealprice;
    }

    public String getMealhotel() {
        return mealhotel;
    }

    public void setMealhotel(String mealhotel) {
        this.mealhotel = mealhotel;
    }

    public String getMealair() {
        return mealair;
    }

    public void setMealair(String mealair) {
        this.mealair = mealair;
    }

    public String getMealsettime() {
        return mealsettime;
    }

    public void setMealsettime(String mealsettime) {
        this.mealsettime = mealsettime;
    }

    public String getMealphoto() {
        return mealphoto;
    }

    public void setMealphoto(String mealphoto) {
        this.mealphoto = mealphoto;
    }

    public String getMealxiang() {
        return mealxiang;
    }

    public void setMealxiang(String mealxiang) {
        this.mealxiang = mealxiang;
    }
}
