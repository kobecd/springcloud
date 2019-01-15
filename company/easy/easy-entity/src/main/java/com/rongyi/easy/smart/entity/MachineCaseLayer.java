package com.rongyi.easy.smart.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yandong on 2017/10/25.
 */
public class MachineCaseLayer implements Serializable {

    private List<String> terminalIdList;

    List<CaseLayerP> layerList;

    public List<CaseLayerP> getLayerList() {
        return layerList;
    }

    public void setLayerList(List<CaseLayerP> layerList) {
        this.layerList = layerList;
    }

    public List<String> getTerminalIdList() {
        return terminalIdList;
    }

    public void setTerminalIdList(List<String> terminalIdList) {
        this.terminalIdList = terminalIdList;
    }
}
