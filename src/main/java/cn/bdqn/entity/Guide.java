package cn.bdqn.entity;

import java.util.Date;

/**
 * 旅游向导
 * Created by Administrator on 2018/3/19.
 */
public class Guide {
    /**
     * W_id int(11) NOT NULL逐渐自增
     W_sbeText varchar(30) NOT NULL搜索类别
     W_list int(30) NOT NULL排序
     W_congig varchar(30) NOT NULL审核
     W_time datetime NOT NULL升级
     */
    private int wId,visbble;
    private String wSbe;
    private int wList;
    private String wCongig;
    private Date wTime;

    @Override
    public String toString() {
        return "Guide{" +
                "wId=" + wId +
                ", visbble=" + visbble +
                ", wSbe='" + wSbe + '\'' +
                ", wList=" + wList +
                ", wCongig='" + wCongig + '\'' +
                ", wTime=" + wTime +
                '}';
    }

    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    public int getVisbble() {
        return visbble;
    }

    public void setVisbble(int visbble) {
        this.visbble = visbble;
    }

    public String getwSbe() {
        return wSbe;
    }

    public void setwSbe(String wSbe) {
        this.wSbe = wSbe;
    }

    public int getwList() {
        return wList;
    }

    public void setwList(int wList) {
        this.wList = wList;
    }

    public String getwCongig() {
        return wCongig;
    }

    public void setwCongig(String wCongig) {
        this.wCongig = wCongig;
    }

    public Date getwTime() {
        return wTime;
    }

    public void setwTime(Date wTime) {
        this.wTime = wTime;
    }
}
