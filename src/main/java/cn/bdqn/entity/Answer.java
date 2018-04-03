package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by zhibai on 2018/3/19.
 *
 * answerAuthor 回答者
 * answerContext 回复内容
 * answerScore 回答积分
 * answerAddtime 回答时间
 */
public class Answer {
    private int answerId,answerScore,visbble;
    private String answerAuthor,answerContext;
    private Date answerAddtime;

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", answerScore=" + answerScore +
                ", visbble=" + visbble +
                ", answerAuthor='" + answerAuthor + '\'' +
                ", answerContext='" + answerContext + '\'' +
                ", answerAddtime=" + answerAddtime +
                '}';
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getAnswerScore() {
        return answerScore;
    }

    public void setAnswerScore(int answerScore) {
        this.answerScore = answerScore;
    }

    public int getVisbble() {
        return visbble;
    }

    public void setVisbble(int visbble) {
        this.visbble = visbble;
    }

    public String getAnswerAuthor() {
        return answerAuthor;
    }

    public void setAnswerAuthor(String answerAuthor) {
        this.answerAuthor = answerAuthor;
    }

    public String getAnswerContext() {
        return answerContext;
    }

    public void setAnswerContext(String answerContext) {
        this.answerContext = answerContext;
    }

    public Date getAnswerAddtime() {
        return answerAddtime;
    }

    public void setAnswerAddtime(Date answerAddtime) {
        this.answerAddtime = answerAddtime;
    }
}
