package com.example.demo.po;

public class Videos {
    private Integer vId;

    private String vName;

    private String vUrl;

    private String vImg;

    private String vConcent;

    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName == null ? null : vName.trim();
    }

    public String getvUrl() {
        return vUrl;
    }

    public void setvUrl(String vUrl) {
        this.vUrl = vUrl == null ? null : vUrl.trim();
    }

    public String getvImg() {
        return vImg;
    }

    public void setvImg(String vImg) {
        this.vImg = vImg == null ? null : vImg.trim();
    }

    public String getvConcent() {
        return vConcent;
    }

    public void setvConcent(String vConcent) {
        this.vConcent = vConcent == null ? null : vConcent.trim();
    }
}