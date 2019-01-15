package com.rongyi.easy.smart.entity;

import java.io.Serializable;

public class MachineSetEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer onTime;

    private Integer offTime;

    private Integer machineId;

    private Integer dateSet;

    private Byte isAble;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOnTime() {
        return onTime;
    }

    public void setOnTime(Integer onTime) {
        this.onTime = onTime;
    }

    public Integer getOffTime() {
        return offTime;
    }

    public void setOffTime(Integer offTime) {
        this.offTime = offTime;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public Integer getDateSet() {
        return dateSet;
    }

    public void setDateSet(Integer dateSet) {
        this.dateSet = dateSet;
    }

    public Byte getIsAble() {
        return isAble;
    }

    public void setIsAble(Byte isAble) {
        this.isAble = isAble;
    }
}