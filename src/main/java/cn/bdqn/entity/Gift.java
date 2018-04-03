package cn.bdqn.entity;

/**
 * Created by zhibai on 2018/3/19.
 *
 * integral 该礼物所需要的积分
 * gift 礼物
 * sid 积分表主键
 */
public class Gift {
    private int giftId,integral,sid,visbble;
    private String gift;

    @Override
    public String toString() {
        return "Gift{" +
                "giftId=" + giftId +
                ", integral=" + integral +
                ", sid=" + sid +
                ", visbble=" + visbble +
                ", gift='" + gift + '\'' +
                '}';
    }

    public int getGiftId() {
        return giftId;
    }

    public void setGiftId(int giftId) {
        this.giftId = giftId;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getVisbble() {
        return visbble;
    }

    public void setVisbble(int visbble) {
        this.visbble = visbble;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }
}
