package cn.bdqn.entity;

/**
 * Created by zhibai on 2018/3/19.
 *
 * askAuther 提问排序
 * askList 提问编号
 * askDorid 上一级编号
 */
public class Ask {
    private int askId,visbble;
    private String askAuther,askList,askDorid;

    @Override
    public String toString() {
        return "Ask{" +
                "askId=" + askId +
                ", visbble=" + visbble +
                ", askAuther='" + askAuther + '\'' +
                ", askList='" + askList + '\'' +
                ", askDorid='" + askDorid + '\'' +
                '}';
    }

    public int getAskId() {
        return askId;
    }

    public void setAskId(int askId) {
        this.askId = askId;
    }

    public int getVisbble() {
        return visbble;
    }

    public void setVisbble(int visbble) {
        this.visbble = visbble;
    }

    public String getAskAuther() {
        return askAuther;
    }

    public void setAskAuther(String askAuther) {
        this.askAuther = askAuther;
    }

    public String getAskList() {
        return askList;
    }

    public void setAskList(String askList) {
        this.askList = askList;
    }

    public String getAskDorid() {
        return askDorid;
    }

    public void setAskDorid(String askDorid) {
        this.askDorid = askDorid;
    }
}
