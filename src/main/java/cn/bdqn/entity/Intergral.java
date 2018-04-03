package cn.bdqn.entity;

/**
 * Created by zhang on 2018/3/19.
 */
public class Intergral {
    /**
     * integral_idint(11)
     integral int(100) 积分总
     userid int(11) 用户表主键
     *
     */
    private Integer integeralId,visbble;
    private Integer integral;
    private Integer userid;

    @Override
    public String toString() {
        return "Intergral{" +
                "integeralId=" + integeralId +
                ", visbble=" + visbble +
                ", integral=" + integral +
                ", userid=" + userid +
                '}';
    }

    public Integer getIntegeralId() {
        return integeralId;
    }

    public void setIntegeralId(Integer integeralId) {
        this.integeralId = integeralId;
    }

    public Integer getVisbble() {
        return visbble;
    }

    public void setVisbble(Integer visbble) {
        this.visbble = visbble;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
