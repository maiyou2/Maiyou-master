package cn.bdqn.entity;

/**
 * Created by zhang on 2018/3/19.
 *log_id     int(11)      (NULL)     NO      PRI     (NULL)   auto_increment  select,insert,update,references
 log_name   varchar(20)  utf8_bin   YES             (NULL)                   select,insert,update,references  地方名称
 log_tpye   varchar(20)  utf8_bin   YES             (NULL)                   select,insert,update,references  玩乐类型
 log_phone  text         utf8_bin   YES             (NULL)                   select,insert,update,references  图片

 */
public class Log {
    private Integer logId,visbble;
    private String logName;
    private String logType;
    private String logPhone;

    @Override
    public String toString() {
        return "Log{" +
                "logId=" + logId +
                ", visbble=" + visbble +
                ", logName='" + logName + '\'' +
                ", logType='" + logType + '\'' +
                ", logPhone='" + logPhone + '\'' +
                '}';
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getVisbble() {
        return visbble;
    }

    public void setVisbble(Integer visbble) {
        this.visbble = visbble;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getLogPhone() {
        return logPhone;
    }

    public void setLogPhone(String logPhone) {
        this.logPhone = logPhone;
    }
}
