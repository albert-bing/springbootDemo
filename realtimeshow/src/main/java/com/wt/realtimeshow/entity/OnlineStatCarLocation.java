package com.wt.realtimeshow.entity;


public class OnlineStatCarLocation {
    private int id;
    private String vin;
    private String carsSeries;
    private String channelId;
    private String longitude;
    private String latitude;
    private String districtId;
    private String cityId;
    private String provinceId;
    private String currentTime;

    @Override
    public String toString() {
        return "OnlineStatCarLocation{" +
                "id=" + id +
                ", vin='" + vin + '\'' +
                ", carsSeries='" + carsSeries + '\'' +
                ", channelId='" + channelId + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", districtId='" + districtId + '\'' +
                ", cityId='" + cityId + '\'' +
                ", provinceId='" + provinceId + '\'' +
                ", currentTime='" + currentTime + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
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

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
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

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public OnlineStatCarLocation(int id, String vin, String carsSeries, String channelId, String longitude, String latitude, String districtId, String cityId, String provinceId, String currentTime) {
        this.id = id;
        this.vin = vin;
        this.carsSeries = carsSeries;
        this.channelId = channelId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.districtId = districtId;
        this.cityId = cityId;
        this.provinceId = provinceId;
        this.currentTime = currentTime;
    }
}
