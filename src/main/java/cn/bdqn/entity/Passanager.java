package cn.bdqn.entity;

/**
 * Created by zhang on 2018/3/19.
 * passanage_id      int(11)        (NULL)     NO      PRI     (NULL)   auto_increment  select,insert,update,references  主键
 passanage_name    varbinary(30)  (NULL)     NO              (NULL)                   select,insert,update,references  姓名
 passanage_idcard  int(40)        (NULL)     NO              (NULL)                   select,insert,update,references  身份证号
 passanage_phone   int(16)        (NULL)     YES             (NULL)                   select,insert,update,references  联系方式
 user_id           int(16)        (NULL)     YES             (NULL)                   select,insert,update,references  用户主键

 */
public class Passanager {
    private int passanageId,passanageIdCard,passanagePhone,userId,visbble;
    private String passanageName;

    @Override
    public String toString() {
        return "Passanager{" +
                "passanageId=" + passanageId +
                ", passanageIdCard=" + passanageIdCard +
                ", passanagePhone=" + passanagePhone +
                ", userId=" + userId +
                ", visbble=" + visbble +
                ", passanageName='" + passanageName + '\'' +
                '}';
    }

    public int getPassanageId() {
        return passanageId;
    }

    public void setPassanageId(int passanageId) {
        this.passanageId = passanageId;
    }

    public int getPassanageIdCard() {
        return passanageIdCard;
    }

    public void setPassanageIdCard(int passanageIdCard) {
        this.passanageIdCard = passanageIdCard;
    }

    public int getPassanagePhone() {
        return passanagePhone;
    }

    public void setPassanagePhone(int passanagePhone) {
        this.passanagePhone = passanagePhone;
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

    public String getPassanageName() {
        return passanageName;
    }

    public void setPassanageName(String passanageName) {
        this.passanageName = passanageName;
    }
}
