package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by zhibai on 2018/3/19.
 *
 * adminName管理员账号
 * password管理员密码
 * adminRank级别
 * adminRote角色
 * adminTime上次登陆时间
 */
public class Admin {
    private int adminId,visbble ;
    private String adminName,password,adminRank,adminRote;
    private Date adminTime;

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", visbble=" + visbble +
                ", adminName='" + adminName + '\'' +
                ", password='" + password + '\'' +
                ", adminRank='" + adminRank + '\'' +
                ", adminRote='" + adminRote + '\'' +
                ", adminTime=" + adminTime +
                '}';
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getVisbble() {
        return visbble;
    }

    public void setVisbble(int visbble) {
        this.visbble = visbble;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdminRank() {
        return adminRank;
    }

    public void setAdminRank(String adminRank) {
        this.adminRank = adminRank;
    }

    public String getAdminRote() {
        return adminRote;
    }

    public void setAdminRote(String adminRote) {
        this.adminRote = adminRote;
    }

    public Date getAdminTime() {
        return adminTime;
    }

    public void setAdminTime(Date adminTime) {
        this.adminTime = adminTime;
    }
}
