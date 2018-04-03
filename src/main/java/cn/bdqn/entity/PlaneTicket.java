package cn.bdqn.entity;

/**
 * Created by wenzhichao on 2018/3/20.
 */
public class PlaneTicket {

    /**
     * Created by zhang on 2018/3/19.
     * plane_id          int(11)      (NULL)     NO      PRI     (NULL)   auto_increment  select,insert,update,references  主键
     plane_way         varchar(30)  utf8_bin   YES             (NULL)                   select,insert,update,references  单程
     plane_goto        varchar(30)  utf8_bin   YES             (NULL)                   select,insert,update,references  往返
     plane_price       double       (NULL)     YES             (NULL)                   select,insert,update,references  价格
     plane_make_price  varchar(30)  utf8_bin   YES             (NULL)                   select,insert,update,references  预约时间
     plane_goto_time   varchar(30)  utf8_bin   YES             (NULL)                   select,insert,update,references  往返时间
     plane_origin      varchar(30)  utf8_bin   YES             (NULL)                   select,insert,update,references  上机地点
     plane_goal        varchar(30)  utf8_bin   YES             (NULL)                   select,insert,update,references  下机地点

     */
    private Integer planeId,visbble;
    private String planeWay,planeGoto,planeGotoTime,planeOrigin,planGoal,plankeMakePrice;
    private double planePrice;

    @Override
    public String toString() {
        return "PlaneTicket{" +
                "planeId=" + planeId +
                ", visbble=" + visbble +
                ", planeWay='" + planeWay + '\'' +
                ", planeGoto='" + planeGoto + '\'' +
                ", planeGotoTime='" + planeGotoTime + '\'' +
                ", planeOrigin='" + planeOrigin + '\'' +
                ", planGoal='" + planGoal + '\'' +
                ", planePrice=" + planePrice +
                '}';
    }

    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    public Integer getVisbble() {
        return visbble;
    }

    public void setVisbble(Integer visbble) {
        this.visbble = visbble;
    }

    public String getPlaneWay() {
        return planeWay;
    }

    public void setPlaneWay(String planeWay) {
        this.planeWay = planeWay;
    }

    public String getPlaneGoto() {
        return planeGoto;
    }

    public void setPlaneGoto(String planeGoto) {
        this.planeGoto = planeGoto;
    }

    public String getPlaneGotoTime() {
        return planeGotoTime;
    }

    public void setPlaneGotoTime(String planeGotoTime) {
        this.planeGotoTime = planeGotoTime;
    }

    public String getPlaneOrigin() {
        return planeOrigin;
    }

    public void setPlaneOrigin(String planeOrigin) {
        this.planeOrigin = planeOrigin;
    }

    public String getPlanGoal() {
        return planGoal;
    }

    public void setPlanGoal(String planGoal) {
        this.planGoal = planGoal;
    }

    public double getPlanePrice() {
        return planePrice;
    }

    public void setPlanePrice(double planePrice) {
        this.planePrice = planePrice;
    }
}
