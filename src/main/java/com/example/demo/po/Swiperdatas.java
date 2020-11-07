package com.example.demo.po;

public class Swiperdatas {
    private Integer swId;

    private String swImg;

    private String openType;

    private Integer bookId;

    private String navigatoUrl;

    public Integer getSwId() {
        return swId;
    }

    public void setSwId(Integer swId) {
        this.swId = swId;
    }

    public String getSwImg() {
        return swImg;
    }

    public void setSwImg(String swImg) {
        this.swImg = swImg == null ? null : swImg.trim();
    }

    public String getOpenType() {
        return openType;
    }

    public void setOpenType(String openType) {
        this.openType = openType == null ? null : openType.trim();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getNavigatoUrl() {
        return navigatoUrl;
    }

    public void setNavigatoUrl(String navigatoUrl) {
        this.navigatoUrl = navigatoUrl == null ? null : navigatoUrl.trim();
    }
}