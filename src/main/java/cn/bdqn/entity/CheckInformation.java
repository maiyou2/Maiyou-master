package cn.bdqn.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by zhibai on 2018/3/19.
 * check_Id 主键
 * check_intime 入住时间
 * check_ontime 离店时间
 * check_peopleNum 身份证
 * check_name 入住人姓名
 * check_phone 联系方式
 * hotel_id 酒店主键
 */
public class CheckInformation {
    private  int checkId,hotelId,visbble;
    private String checkPeopleNum,checkName,checkPhone;
    @JSONField(format = "yyyy-MM-dd")
    private Date check_intime,check_ontime;

    @Override
    public String toString() {
        return "CheckInformation{" +
                "checkId=" + checkId +
                ", hotelId=" + hotelId +
                ", visbble=" + visbble +
                ", checkPeopleNum='" + checkPeopleNum + '\'' +
                ", checkName='" + checkName + '\'' +
                ", checkPhone='" + checkPhone + '\'' +
                ", check_intime=" + check_intime +
                ", check_ontime=" + check_ontime +
                '}';
    }

    public int getCheckId() {
        return checkId;
    }

    public void setCheckId(int checkId) {
        this.checkId = checkId;
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

    public String getCheckPeopleNum() {
        return checkPeopleNum;
    }

    public void setCheckPeopleNum(String checkPeopleNum) {
        this.checkPeopleNum = checkPeopleNum;
    }

    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public String getCheckPhone() {
        return checkPhone;
    }

    public void setCheckPhone(String checkPhone) {
        this.checkPhone = checkPhone;
    }

    public Date getCheck_intime() {
        return check_intime;
    }

    public void setCheck_intime(Date check_intime) {
        this.check_intime = check_intime;
    }

    public Date getCheck_ontime() {
        return check_ontime;
    }

    public void setCheck_ontime(Date check_ontime) {
        this.check_ontime = check_ontime;
    }
}
