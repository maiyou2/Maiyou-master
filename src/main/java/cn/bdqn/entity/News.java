package cn.bdqn.entity;

/**
 * Created by zhang on 2018/3/19.
 * News_id       int(11)      (NULL)     NO      PRI     (NULL)   auto_increment  select,insert,update,references  主键自增
 News_title    varchar(30)  utf8_bin   NO              (NULL)                   select,insert,update,references  信息标题
 News_mark     varchar(30)  utf8_bin   NO              (NULL)                   select,insert,update,references  关键字标志
 News_photo    tinytext     utf8_bin   NO              (NULL)                   select,insert,update,references  新闻图片
 News_context  varchar(30)  utf8_bin   YES             (NULL)                   select,insert,update,references  显示详情

 */
public class News {
    private Integer newsId,visbble;
    private String newsTitle;
    private String  newsMark;
    private String newsPhoto;
    private String newsContext;

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", visbble=" + visbble +
                ", newsTitle='" + newsTitle + '\'' +
                ", newsMark='" + newsMark + '\'' +
                ", newsPhoto='" + newsPhoto + '\'' +
                ", newsContext='" + newsContext + '\'' +
                '}';
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public Integer getVisbble() {
        return visbble;
    }

    public void setVisbble(Integer visbble) {
        this.visbble = visbble;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsMark() {
        return newsMark;
    }

    public void setNewsMark(String newsMark) {
        this.newsMark = newsMark;
    }

    public String getNewsPhoto() {
        return newsPhoto;
    }

    public void setNewsPhoto(String newsPhoto) {
        this.newsPhoto = newsPhoto;
    }

    public String getNewsContext() {
        return newsContext;
    }

    public void setNewsContext(String newsContext) {
        this.newsContext = newsContext;
    }
}
