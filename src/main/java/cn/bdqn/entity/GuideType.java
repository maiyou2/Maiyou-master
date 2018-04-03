package cn.bdqn.entity;

/**
 * 旅游向导类别
 * Created by Administrator on 2018/3/19.
 */
public class GuideType {
    /**
     * Wiz_id int(11) NOT NULL主键
     Wiz_sbuTxt varchar(30) NOT NULL简要说明
     Wiz_list int(30) NOT NULL排序
     Wiz_role varchar(30) NULL角色
     */
    private int wizId,wizList,visbble;
    private String wizSbuTxt,wizRoal;

    @Override
    public String toString() {
        return "GuideType{" +
                "wizId=" + wizId +
                ", wizList=" + wizList +
                ", visbble=" + visbble +
                ", wizSbuTxt='" + wizSbuTxt + '\'' +
                ", wizRoal='" + wizRoal + '\'' +
                '}';
    }

    public int getWizId() {
        return wizId;
    }

    public void setWizId(int wizId) {
        this.wizId = wizId;
    }

    public int getWizList() {
        return wizList;
    }

    public void setWizList(int wizList) {
        this.wizList = wizList;
    }

    public int getVisbble() {
        return visbble;
    }

    public void setVisbble(int visbble) {
        this.visbble = visbble;
    }

    public String getWizSbuTxt() {
        return wizSbuTxt;
    }

    public void setWizSbuTxt(String wizSbuTxt) {
        this.wizSbuTxt = wizSbuTxt;
    }

    public String getWizRoal() {
        return wizRoal;
    }

    public void setWizRoal(String wizRoal) {
        this.wizRoal = wizRoal;
    }
}
