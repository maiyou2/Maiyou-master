package cn.bdqn.entity;

/**
 * Created by zhang on 2018/3/19.
 * picgoroup_id       int(11)      (NULL)     NO      PRI     (NULL)   auto_increment  select,insert,update,references  主键自增
 picgoroup_author   varchar(30)  utf8_bin   NO              (NULL)                   select,insert,update,references  图片名称
 picgoroup_context  varchar(30)  utf8_bin   NO              (NULL)                   select,insert,update,references  内容回复
 picgoroup_list     varchar(30)  utf8_bin   NO              (NULL)                   select,insert,update,references  图片列表
 picgoroup_role     varchar(30)  utf8_bin   NO              (NULL)                   select,insert,update,references  角色

 */
public class Picgoroup {
    private Integer picgoroupId,visbble;
    private String picgoroupAuthor,picgoroupContext,picgoroupList,picgoroupRole;

    @Override
    public String toString() {
        return "Picgoroup{" +
                "picgoroupId=" + picgoroupId +
                ", visbble=" + visbble +
                ", picgoroupAuthor='" + picgoroupAuthor + '\'' +
                ", picgoroupContext='" + picgoroupContext + '\'' +
                ", picgoroupList='" + picgoroupList + '\'' +
                ", picgoroupRole='" + picgoroupRole + '\'' +
                '}';
    }

    public Integer getPicgoroupId() {
        return picgoroupId;
    }

    public void setPicgoroupId(Integer picgoroupId) {
        this.picgoroupId = picgoroupId;
    }

    public Integer getVisbble() {
        return visbble;
    }

    public void setVisbble(Integer visbble) {
        this.visbble = visbble;
    }

    public String getPicgoroupAuthor() {
        return picgoroupAuthor;
    }

    public void setPicgoroupAuthor(String picgoroupAuthor) {
        this.picgoroupAuthor = picgoroupAuthor;
    }

    public String getPicgoroupContext() {
        return picgoroupContext;
    }

    public void setPicgoroupContext(String picgoroupContext) {
        this.picgoroupContext = picgoroupContext;
    }

    public String getPicgoroupList() {
        return picgoroupList;
    }

    public void setPicgoroupList(String picgoroupList) {
        this.picgoroupList = picgoroupList;
    }

    public String getPicgoroupRole() {
        return picgoroupRole;
    }

    public void setPicgoroupRole(String picgoroupRole) {
        this.picgoroupRole = picgoroupRole;
    }
}
