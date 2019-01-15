package com.rongyi.easy.smart.vo;

/**
 * Created by yandong on 2017/12/29.
 */
public class MachineStatisticsVO {

    private String type;
    private String rjsjByDeviceNumberSum;
    private String time;
    private String province;
    private String city;
    private String district;
    private String mallName;
    private String terminalName;
    private String layoutId;
    private String layoutName;
    private String mouldId;
    private String mouldName;
    private String deviceNumber;
    private String llrsByDeviceNumberSum;
    private String jgrsByDeviceNumberSum;
    private Double wifiAndroidByDeviceNumberSum;

    private String machineName;
    private String machineAddress;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRjsjByDeviceNumberSum() {
        return rjsjByDeviceNumberSum;
    }

    public void setRjsjByDeviceNumberSum(String rjsjByDeviceNumberSum) {
        this.rjsjByDeviceNumberSum = rjsjByDeviceNumberSum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public String getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    public String getLayoutName() {
        return layoutName;
    }

    public void setLayoutName(String layoutName) {
        this.layoutName = layoutName;
    }

    public String getMouldId() {
        return mouldId;
    }

    public void setMouldId(String mouldId) {
        this.mouldId = mouldId;
    }

    public String getMouldName() {
        return mouldName;
    }

    public void setMouldName(String mouldName) {
        this.mouldName = mouldName;
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public String getLlrsByDeviceNumberSum() {
        return llrsByDeviceNumberSum;
    }

    public void setLlrsByDeviceNumberSum(String llrsByDeviceNumberSum) {
        this.llrsByDeviceNumberSum = llrsByDeviceNumberSum;
    }

    public String getJgrsByDeviceNumberSum() {
        return jgrsByDeviceNumberSum;
    }

    public void setJgrsByDeviceNumberSum(String jgrsByDeviceNumberSum) {
        this.jgrsByDeviceNumberSum = jgrsByDeviceNumberSum;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getMachineAddress() {
        return machineAddress;
    }

    public void setMachineAddress(String machineAddress) {
        this.machineAddress = machineAddress;
    }

    public Double getWifiAndroidByDeviceNumberSum() {
        return wifiAndroidByDeviceNumberSum;
    }

    public void setWifiAndroidByDeviceNumberSum(Double wifiAndroidByDeviceNumberSum) {
        this.wifiAndroidByDeviceNumberSum = wifiAndroidByDeviceNumberSum;
    }

    @Override
    public String toString() {
        return "MachineStatisticsVO{" +
                "type='" + type + '\'' +
                ", rjsjByDeviceNumberSum='" + rjsjByDeviceNumberSum + '\'' +
                ", time='" + time + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", mallName='" + mallName + '\'' +
                ", terminalName='" + terminalName + '\'' +
                ", layoutId='" + layoutId + '\'' +
                ", layoutName='" + layoutName + '\'' +
                ", mouldId='" + mouldId + '\'' +
                ", mouldName='" + mouldName + '\'' +
                ", deviceNumber='" + deviceNumber + '\'' +
                ", llrsByDeviceNumberSum='" + llrsByDeviceNumberSum + '\'' +
                ", jgrsByDeviceNumberSum='" + jgrsByDeviceNumberSum + '\'' +
                ", wifiAndroidByDeviceNumberSum=" + wifiAndroidByDeviceNumberSum +
                ", machineName='" + machineName + '\'' +
                ", machineAddress='" + machineAddress + '\'' +
                '}';
    }
}
