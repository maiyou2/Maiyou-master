package cn.bdqn.entity;

/**
 * 酒店房型价格表
 * Created by Administrator on 2018/3/19.
 */
public class HotelRoomRatea {
    /**
     *
     FieldTypeComment
     h_rates_id int(11) NOT NULL
     hotel_room varchar(30) NOT NULL房型
     hotel_print text NULL房型图片
     price double NOT NULL价格
     hotel_id int(11) NOT NULL酒店主键
     */
    private int hRatesId,hotelId,visbble;
    private String hotelRoom,hotelPrint;
    private Double price;

    @Override
    public String toString() {
        return "HotelRoomRatea{" +
                "hRatesId=" + hRatesId +
                ", hotelId=" + hotelId +
                ", visbble=" + visbble +
                ", hotelRoom='" + hotelRoom + '\'' +
                ", hotelPrint='" + hotelPrint + '\'' +
                ", price=" + price +
                '}';
    }

    public int gethRatesId() {
        return hRatesId;
    }

    public void sethRatesId(int hRatesId) {
        this.hRatesId = hRatesId;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int getVisbble() {
        return visbble;
    }

    public void setVisbble(int visbble) {
        this.visbble = visbble;
    }

    public String getHotelRoom() {
        return hotelRoom;
    }

    public void setHotelRoom(String hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    public String getHotelPrint() {
        return hotelPrint;
    }

    public void setHotelPrint(String hotelPrint) {
        this.hotelPrint = hotelPrint;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
