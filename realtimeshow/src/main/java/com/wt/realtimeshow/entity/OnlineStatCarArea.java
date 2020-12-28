package com.wt.realtimeshow.entity;

public class OnlineStatCarArea {
    private int id;
    private String carsSeries;
    private String channelId;
    private String districtId;
    private String cityId;
    private String provinceId;
    private String carNumber;
    private String currentTime;
    private String ymd;
    private String timeMark;
    private String province_name;
    private String city_name;
    private String area_name;

    @Override
    public String toString() {
        return "OnlineStatCarArea{" +
                "id=" + id +
                ", carsSeries='" + carsSeries + '\'' +
                ", channelId='" + channelId + '\'' +
                ", districtId='" + districtId + '\'' +
                ", cityId='" + cityId + '\'' +
                ", provinceId='" + provinceId + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", currentTime='" + currentTime + '\'' +
                ", ymd='" + ymd + '\'' +
                ", timeMark='" + timeMark + '\'' +
                ", province_name='" + province_name + '\'' +
                ", city_name='" + city_name + '\'' +
                ", area_name='" + area_name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarsSeries() {
        return carsSeries;
    }

    public void setCarsSeries(String carsSeries) {
        this.carsSeries = carsSeries;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getYmd() {
        return ymd;
    }

    public void setYmd(String ymd) {
        this.ymd = ymd;
    }

    public String getTimeMark() {
        return timeMark;
    }

    public void setTimeMark(String timeMark) {
        this.timeMark = timeMark;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public OnlineStatCarArea(int id, String carsSeries, String channelId, String districtId, String cityId, String provinceId, String carNumber, String currentTime, String ymd, String timeMark, String province_name, String city_name, String area_name) {
        this.id = id;
        this.carsSeries = carsSeries;
        this.channelId = channelId;
        this.districtId = districtId;
        this.cityId = cityId;
        this.provinceId = provinceId;
        this.carNumber = carNumber;
        this.currentTime = currentTime;
        this.ymd = ymd;
        this.timeMark = timeMark;
        this.province_name = province_name;
        this.city_name = city_name;
        this.area_name = area_name;
    }
}
