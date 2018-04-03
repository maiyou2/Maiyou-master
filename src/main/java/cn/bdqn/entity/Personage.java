package cn.bdqn.entity;

/**
 * Created by zhang on 2018/3/19.
 * id               int(8)       (NULL)     NO      PRI     (NULL)   auto_increment  select,insert,update,references
 name             varchar(20)  utf8_bin   NO              (NULL)                   select,insert,update,references  姓名
 sex              varchar(10)  utf8_bin   NO              (NULL)                   select,insert,update,references  性别
 age              int(10)      (NULL)     NO              (NULL)                   select,insert,update,references  年龄
 id_card          int(18)      (NULL)     NO              (NULL)                   select,insert,update,references  身份证
 Cellphonenumber  int(11)      (NULL)     NO              (NULL)                   select,insert,update,references  手机号
 nation           varchar(20)  utf8_bin   NO              (NULL)                   select,insert,update,references  名族
 the_integral     int(11)      (NULL)     YES             (NULL)                   select,insert,update,references  积分
 user_id          int(11)      (NULL)     YES             (NULL)                   select,insert,update,references  用户表主键

 */
public class Personage {
    private Integer id,age,idCard,theIntegral,userId,visbble;
    private String name,sex,nation;

    @Override
    public String toString() {
        return "Personage{" +
                "id=" + id +
                ", age=" + age +
                ", idCard=" + idCard +
                ", theIntegral=" + theIntegral +
                ", userId=" + userId +
                ", visbble=" + visbble +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public Integer getTheIntegral() {
        return theIntegral;
    }

    public void setTheIntegral(Integer theIntegral) {
        this.theIntegral = theIntegral;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVisbble() {
        return visbble;
    }

    public void setVisbble(Integer visbble) {
        this.visbble = visbble;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}
