package cn.bdqn.entity;

/**
 * 行业类别消息
 * Created by Administrator on 2018/3/19.
 */
public class Indust {
    /**
     *
     FieldTypeComment
     indust_id int(11) NOT NULL主键自增
     indist_name varchar(30) NOT NULL行业信息
     indust_config varchar(30) NOT NULL审核状态
     indust_list varchar(30) NULL排序
     */
    private int industId,visbble;
    private String industName,industConfig,industList;

    @Override
    public String toString() {
        return "Indust{" +
                "industId=" + industId +
                ", visbble=" + visbble +
                ", industName='" + industName + '\'' +
                ", industConfig='" + industConfig + '\'' +
                ", industList='" + industList + '\'' +
                '}';
    }

    public int getIndustId() {
        return industId;
    }

    public void setIndustId(int industId) {
        this.industId = industId;
    }

    public int getVisbble() {
        return visbble;
    }

    public void setVisbble(int visbble) {
        this.visbble = visbble;
    }

    public String getIndustName() {
        return industName;
    }

    public void setIndustName(String industName) {
        this.industName = industName;
    }

    public String getIndustConfig() {
        return industConfig;
    }

    public void setIndustConfig(String industConfig) {
        this.industConfig = industConfig;
    }

    public String getIndustList() {
        return industList;
    }

    public void setIndustList(String industList) {
        this.industList = industList;
    }
}
