package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by zhibai on 2018/3/19.
 *
 * 广告表
 *
 * adid逐渐自增
 * adCalssid广告编号
 * adTitle标题
 * adPhoto图片
 * adContext广告备注
 * adLimittime极限时间设定
 * adAddtime发布时间
 */
public class Ad {
    private int adId,adCalssid,visbble;
    private String adTitle,adPhoto,adContext;
    private Date adLimittime,adAddtime;

    public int getAdId() {
        return adId;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public int getAdCalssid() {
        return adCalssid;
    }

    public void setAdCalssid(int adCalssid) {
        this.adCalssid = adCalssid;
    }

    public int getVisbble() {
        return visbble;
    }

    public void setVisbble(int visbble) {
        this.visbble = visbble;
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }

    public String getAdPhoto() {
        return adPhoto;
    }

    public void setAdPhoto(String adPhoto) {
        this.adPhoto = adPhoto;
    }

    public String getAdContext() {
        return adContext;
    }

    public void setAdContext(String adContext) {
        this.adContext = adContext;
    }

    public Date getAdLimittime() {
        return adLimittime;
    }

    public void setAdLimittime(Date adLimittime) {
        this.adLimittime = adLimittime;
    }

    public Date getAdAddtime() {
        return adAddtime;
    }

    public void setAdAddtime(Date adAddtime) {
        this.adAddtime = adAddtime;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "adId=" + adId +
                ", adCalssid=" + adCalssid +
                ", visbble=" + visbble +
                ", adTitle='" + adTitle + '\'' +
                ", adPhoto='" + adPhoto + '\'' +
                ", adContext='" + adContext + '\'' +
                ", adLimittime=" + adLimittime +
                ", adAddtime=" + adAddtime +
                '}';
    }
}
