package cn.bdqn.vo;

import cn.bdqn.entity.*;
import cn.bdqn.entity.Package;

/**
 * Created by wenzhichao on 2018/3/20.
 */
public class OrderFormVo extends OrderForm{
    /**
     * train_tickets  火车票表
     * plane_ticket  飞机票
     * USER 用户
     * package 套餐
     * hotel  酒店
     */
    private TrainTickets trainTickets;
    private PlaneTicket planeTicket;
    private User user;
    private Package aPackage;
    private CheckInformation checkInformation;

    public CheckInformation getCheckInformation() {
        return checkInformation;
    }

    public void setCheckInformation(CheckInformation checkInformation) {
        this.checkInformation = checkInformation;
    }

    @Override
    public String toString() {
        return "OrderFormVo{" +
                "trainTickets=" + trainTickets +
                ", planeTicket=" + planeTicket +
                ", user=" + user +
                ", aPackage=" + aPackage +
                ", hotel=" + hotel +
                ", orderForm=" + orderForm +
                '}';
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    private Hotel hotel;
    private OrderForm orderForm;

    public OrderForm getOrderForm() {
        return orderForm;
    }

    public void setOrderForm(OrderForm orderForm) {
        this.orderForm = orderForm;
    }



    public TrainTickets getTrainTickets() {
        return trainTickets;
    }

    public void setTrainTickets(TrainTickets trainTickets) {
        this.trainTickets = trainTickets;
    }

    public PlaneTicket getPlaneTicket() {
        return planeTicket;
    }

    public void setPlaneTicket(PlaneTicket planeTicket) {
        this.planeTicket = planeTicket;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
