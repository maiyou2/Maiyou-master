package cn.bdqn.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by zhang on 2018/3/19.
 * combo_id            int(11)       (NULL)     NO      PRI     (NULL)   auto_increment  select,insert,update,references  主键
 combo               varchar(100)  utf8_bin   YES             (NULL)                   select,insert,update,references  套餐名
 combo_price         double        (NULL)     YES             (NULL)                   select,insert,update,references  价格
 combo_time          date          (NULL)     YES             (NULL)                   select,insert,update,references  开始时间和结束时间
 combo_hotel         varchar(100)  utf8_bin   YES             (NULL)                   select,insert,update,references  套餐酒店
 combo_air           double        (NULL)     YES             (NULL)                   select,insert,update,references  套餐机票
 combo——settime      date          (NULL)     YES             (NULL)                   select,insert,update,references  套餐下单时间

 */
public class Package {
    private Integer comboId,visbble;
    private String combo,comboHotel;
    @JSONField(format = "yyyy-MM-dd")
    private Date comboTime,comboSetTime;
    private double comboAir,comboPrice;

    @Override
    public String toString() {
        return "Package{" +
                "comboId=" + comboId +
                ", visbble=" + visbble +
                ", combo='" + combo + '\'' +
                ", comboHotel='" + comboHotel + '\'' +
                ", comboTime=" + comboTime +
                ", comboSetTime=" + comboSetTime +
                ", comboAir=" + comboAir +
                ", comboPrice=" + comboPrice +
                '}';
    }

    public Integer getComboId() {
        return comboId;
    }

    public void setComboId(Integer comboId) {
        this.comboId = comboId;
    }

    public Integer getVisbble() {
        return visbble;
    }

    public void setVisbble(Integer visbble) {
        this.visbble = visbble;
    }

    public String getCombo() {
        return combo;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }

    public String getComboHotel() {
        return comboHotel;
    }

    public void setComboHotel(String comboHotel) {
        this.comboHotel = comboHotel;
    }

    public Date getComboTime() {
        return comboTime;
    }

    public void setComboTime(Date comboTime) {
        this.comboTime = comboTime;
    }

    public Date getComboSetTime() {
        return comboSetTime;
    }

    public void setComboSetTime(Date comboSetTime) {
        this.comboSetTime = comboSetTime;
    }

    public double getComboAir() {
        return comboAir;
    }

    public void setComboAir(double comboAir) {
        this.comboAir = comboAir;
    }

    public double getComboPrice() {
        return comboPrice;
    }

    public void setComboPrice(double comboPrice) {
        this.comboPrice = comboPrice;
    }
}
