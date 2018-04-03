package cn.bdqn.entity;

/**
 * Created by zhibai on 2018/3/19.
 * appraiseReplyId 主键
 * appraiseReply 回复内容
 * userId 用户主键
 */
public class EvaluationResponse {
    private int appraiseReplyId ,userId,visbble;
    private String appraiseReply;

    @Override
    public String toString() {
        return "EvaluationResponse{" +
                "appraiseReplyId=" + appraiseReplyId +
                ", userId=" + userId +
                ", visbble=" + visbble +
                ", appraiseReply='" + appraiseReply + '\'' +
                '}';
    }

    public int getAppraiseReplyId() {
        return appraiseReplyId;
    }

    public void setAppraiseReplyId(int appraiseReplyId) {
        this.appraiseReplyId = appraiseReplyId;
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

    public String getAppraiseReply() {
        return appraiseReply;
    }

    public void setAppraiseReply(String appraiseReply) {
        this.appraiseReply = appraiseReply;
    }
}
