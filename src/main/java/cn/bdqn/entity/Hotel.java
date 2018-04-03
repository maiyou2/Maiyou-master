package cn.bdqn.entity;

/**
 * 酒店表
 * Created by Administrator on 2018/3/19.
 */
public class Hotel {
    /**
     *
     hotel_id int(11) NOT NULL
     hotel_name varchar(100) NOT NULL酒店名称
     hotel_datail varchar(100) NOT NULL酒店详情
     hotel_phone varchar(11) NOT NULL酒店联系方式
     hotel_address varchar(100) NOT NULL酒店地址
     hotel_starid int(11) NULL酒店星级表主键
     */
    private int hotelId,hotelStarId,visbble;
    private String hotelName,hotelDatail,hotelPhone,hotelAddress;

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelStarId=" + hotelStarId +
                ", visbble=" + visbble +
                ", hotelName='" + hotelName + '\'' +
                ", hotelDatail='" + hotelDatail + '\'' +
                ", hotelPhone='" + hotelPhone + '\'' +
                ", hotelAddress='" + hotelAddress + '\'' +
                '}';
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int getHotelStarId() {
        return hotelStarId;
    }

    public void setHotelStarId(int hotelStarId) {
        this.hotelStarId = hotelStarId;
    }

    public int getVisbble() {
        return visbble;
    }

    public void setVisbble(int visbble) {
        this.visbble = visbble;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelDatail() {
        return hotelDatail;
    }

    public void setHotelDatail(String hotelDatail) {
        this.hotelDatail = hotelDatail;
    }

    public String getHotelPhone() {
        return hotelPhone;
    }

    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
}
