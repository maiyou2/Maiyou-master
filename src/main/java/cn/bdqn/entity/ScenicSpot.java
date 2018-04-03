package cn.bdqn.entity;

/**
 *
 * 景区类
 * Created by wenzhichao on 2018/3/19.
 */
public class ScenicSpot {

    /**
     * id
     * name 景区名字
     * dataile 景区描述
     * ticket 门票
     * recommend 景点推荐
     * phone 手机号
     * paones 其他联系方式
     * address 景区地址
     * critique 景点点评
     */

    private Integer ticket,id,visbble;

    private String name,dateile,recommend,phone,paones,address, critique;

    @Override
    public String toString() {
        return "ScenicSpot{" +
                "ticket=" + ticket +
                ", id=" + id +
                ", visbble=" + visbble +
                ", name='" + name + '\'' +
                ", dateile='" + dateile + '\'' +
                ", recommend='" + recommend + '\'' +
                ", phone='" + phone + '\'' +
                ", paones='" + paones + '\'' +
                ", address='" + address + '\'' +
                ", critique='" + critique + '\'' +
                '}';
    }

    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDateile() {
        return dateile;
    }

    public void setDateile(String dateile) {
        this.dateile = dateile;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPaones() {
        return paones;
    }

    public void setPaones(String paones) {
        this.paones = paones;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCritique() {
        return critique;
    }

    public void setCritique(String critique) {
        this.critique = critique;
    }
}
