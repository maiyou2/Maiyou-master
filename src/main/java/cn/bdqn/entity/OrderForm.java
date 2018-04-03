package cn.bdqn.entity;

/**
 * Created by zhang on 2018/3/19.
 * id           int(11)  (NULL)     NO      PRI     (NULL)   auto_increment  select,insert,update,references
 trip_id      int(11)  (NULL)     YES             (NULL)                   select,insert,update,references  旅游订单
 aircraft_id  int(11)  (NULL)     YES             (NULL)                   select,insert,update,references  机票订单
 train_id     int(11)  (NULL)     YES             (NULL)                   select,insert,update,references  火车票订单
 shopping_id  int(11)  (NULL)     YES             (NULL)                   select,insert,update,references  购物订单
 user_id      int(11)  (NULL)     YES             (NULL)                   select,insert,update,references  用户主键
 combo_id     int(11)  (NULL)     YES             (NULL)                   select,insert,update,references  套餐表主键
 hotel_id     int(11)  (NULL)     YES             (NULL)                   select,insert,update,references  主键表主键

 */
public class OrderForm {
    private Integer id,tripId,aircraftId,trainId,shoppingId,userId,comboId,hotelId,visbble;

    @Override
    public String toString() {
        return "OrderForm{" +
                "id=" + id +
                ", tripId=" + tripId +
                ", aircraftId=" + aircraftId +
                ", trainId=" + trainId +
                ", shoppingId=" + shoppingId +
                ", userId=" + userId +
                ", comboId=" + comboId +
                ", hotelId=" + hotelId +
                ", visbble=" + visbble +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public Integer getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(Integer aircraftId) {
        this.aircraftId = aircraftId;
    }

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public Integer getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(Integer shoppingId) {
        this.shoppingId = shoppingId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getComboId() {
        return comboId;
    }

    public void setComboId(Integer comboId) {
        this.comboId = comboId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getVisbble() {
        return visbble;
    }

    public void setVisbble(Integer visbble) {
        this.visbble = visbble;
    }
}
