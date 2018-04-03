package cn.bdqn.entity;

/**
 * 火车票
 * Created by wenzhichao on 2018/3/19.
 */
public class TrainTickets {

    /**
     * trainId 主键
     trainWay  单程
     trainGoto   往返
     trainMaleTime  预约时间
     trainMaleGotoTime 往返时间
     trainOrigin  上车地点
     trainGoalluarchar 下车地点
     trainPrice  价格
     *
     *
     *
     */



    private Integer trainId,trainWay, trainGoto,visbble;

    private String trainMaleTime,trainMaleGotoTime,trainOrigin, trainGoalluarchar;
    private double trainPrice;

    @Override
    public String toString() {
        return "TrainTickets{" +
                "trainId=" + trainId +
                ", trainWay=" + trainWay +
                ", trainGoto=" + trainGoto +
                ", visbble=" + visbble +
                ", trainMaleTime='" + trainMaleTime + '\'' +
                ", trainMaleGotoTime='" + trainMaleGotoTime + '\'' +
                ", trainOrigin='" + trainOrigin + '\'' +
                ", trainGoalluarchar='" + trainGoalluarchar + '\'' +
                ", trainPrice=" + trainPrice +
                '}';
    }

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public Integer getTrainWay() {
        return trainWay;
    }

    public void setTrainWay(Integer trainWay) {
        this.trainWay = trainWay;
    }

    public Integer getTrainGoto() {
        return trainGoto;
    }

    public void setTrainGoto(Integer trainGoto) {
        this.trainGoto = trainGoto;
    }

    public Integer getVisbble() {
        return visbble;
    }

    public void setVisbble(Integer visbble) {
        this.visbble = visbble;
    }

    public String getTrainMaleTime() {
        return trainMaleTime;
    }

    public void setTrainMaleTime(String trainMaleTime) {
        this.trainMaleTime = trainMaleTime;
    }

    public String getTrainMaleGotoTime() {
        return trainMaleGotoTime;
    }

    public void setTrainMaleGotoTime(String trainMaleGotoTime) {
        this.trainMaleGotoTime = trainMaleGotoTime;
    }

    public String getTrainOrigin() {
        return trainOrigin;
    }

    public void setTrainOrigin(String trainOrigin) {
        this.trainOrigin = trainOrigin;
    }

    public String getTrainGoalluarchar() {
        return trainGoalluarchar;
    }

    public void setTrainGoalluarchar(String trainGoalluarchar) {
        this.trainGoalluarchar = trainGoalluarchar;
    }

    public double getTrainPrice() {
        return trainPrice;
    }

    public void setTrainPrice(double trainPrice) {
        this.trainPrice = trainPrice;
    }
}
