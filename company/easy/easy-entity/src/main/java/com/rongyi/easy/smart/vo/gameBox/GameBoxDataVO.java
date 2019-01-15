package com.rongyi.easy.smart.vo.gameBox;


import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class GameBoxDataVO  implements Serializable {

    private static final long serialVersionUID = 1L;

    private String terminalId; //设备名称

    private Set<Integer> templateId; //模板id

    private List<Integer> gameBoxCaseId; //模板关联游戏id

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public Set<Integer> getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Set<Integer> templateId) {
        this.templateId = templateId;
    }

    public List<Integer> getGameBoxCaseId() {
        return gameBoxCaseId;
    }

    public void setGameBoxCaseId(List<Integer> gameBoxCaseId) {
        this.gameBoxCaseId = gameBoxCaseId;
    }

    @Override
    public String toString() {
        return "GameBoxDataVO{" +
                "terminalId='" + terminalId + '\'' +
                ", templateId=" + templateId +
                ", gameBoxCaseId=" + gameBoxCaseId +
                '}';
    }
}
