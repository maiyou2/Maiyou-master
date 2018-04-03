package cn.bdqn.entity;

/**储蓄信息详情
 * Created by Administrator on 2018/3/19.
 */
public class Info {
    /**
     *
     FieldTypeComment
     info_id int(10) NOT NULL
     info_subid int(30) NOT NULL搜素类型
     info_title varchar(30) NOT NULL信息标题
     info_photo varchar(30) NULL图片路径
     */
    private int infoId,infoSuId,visbble;
    private String infoTitle,infoPhoto;

    @Override
    public String toString() {
        return "Info{" +
                "infoId=" + infoId +
                ", infoSuId=" + infoSuId +
                ", visbble=" + visbble +
                ", infoTitle='" + infoTitle + '\'' +
                ", infoPhoto='" + infoPhoto + '\'' +
                '}';
    }

    public int getInfoId() {
        return infoId;
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }

    public int getInfoSuId() {
        return infoSuId;
    }

    public void setInfoSuId(int infoSuId) {
        this.infoSuId = infoSuId;
    }

    public int getVisbble() {
        return visbble;
    }

    public void setVisbble(int visbble) {
        this.visbble = visbble;
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }

    public String getInfoPhoto() {
        return infoPhoto;
    }

    public void setInfoPhoto(String infoPhoto) {
        this.infoPhoto = infoPhoto;
    }
}
