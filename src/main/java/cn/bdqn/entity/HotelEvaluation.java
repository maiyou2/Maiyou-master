package cn.bdqn.entity;

/**
 * 酒店评价管理表
 * Created by Administrator on 2018/3/19.
 */
public class HotelEvaluation {
    /**
     *
     FieldTypeComment
     room_id int(11) NOT NULL主键
     room_text varchar(100) NULL评价内容
     room_print text NULL评价图片
     room_time date NULL评价时间
     hotel_id int(11) NULL酒店主键
     user_id int(11) NULL用户主键
     */
    private int roomId,hotelId,userId,visbble;
    private String roomText,roomPrint,roomTime;

    @Override
    public String toString() {
        return "HotelEvaluation{" +
                "roomId=" + roomId +
                ", hotelId=" + hotelId +
                ", userId=" + userId +
                ", visbble=" + visbble +
                ", roomText='" + roomText + '\'' +
                ", roomPrint='" + roomPrint + '\'' +
                ", roomTime='" + roomTime + '\'' +
                '}';
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getVisbble() {
        return visbble;
    }

    public void setVisbble(int visbble) {
        this.visbble = visbble;
    }

    public String getRoomText() {
        return roomText;
    }

    public void setRoomText(String roomText) {
        this.roomText = roomText;
    }

    public String getRoomPrint() {
        return roomPrint;
    }

    public void setRoomPrint(String roomPrint) {
        this.roomPrint = roomPrint;
    }

    public String getRoomTime() {
        return roomTime;
    }

    public void setRoomTime(String roomTime) {
        this.roomTime = roomTime;
    }
}
