package com.mm.framework.openapi.model.operational;

import java.io.Serializable;

public class Banner implements Serializable {
    private String banId;
    /**
     * banner类型(与字典表主键关联)
     */
    private String banCategory;
    /**
     * 显示频率
     */
    private String banRate;
    /**
     * 可见城市
     */
    private String banCity;
    /**
     * banner分类(手动/系统)
     */
    private String banType;
    /**
     * banner提示文案
     */
    private String banTitle;
    /**
     * 点击跳转类型
     */
    private String banJumpType;
    /**
     * banner点击跳转路径
     */
    private String banUrl;
    /**
     * banner图标路径
     */
    private String banIcon;
    /**
     * banner状态，0：关闭，1：开启
     */
    private Integer banStatus;
    /**
     * 创建时间(时间戳)
     */
    private Integer banCreateTime;
    /**
     * 创建人
     */
    private String banCreateUser;
    /**
     * 更新时间(时间戳)
     */
    private Integer banUpdateTime;
    /**
     * 更新用户
     */
    private String banUpdateUser;

    public String getBanId() {
        return banId;
    }

    public void setBanId(String banId) {
        this.banId = banId;
    }

    public String getBanCategory() {
        return banCategory;
    }

    public void setBanCategory(String banCategory) {
        this.banCategory = banCategory;
    }

    public String getBanRate() {
        return banRate;
    }

    public void setBanRate(String banRate) {
        this.banRate = banRate;
    }

    public String getBanCity() {
        return banCity;
    }

    public void setBanCity(String banCity) {
        this.banCity = banCity;
    }

    public String getBanType() {
        return banType;
    }

    public void setBanType(String banType) {
        this.banType = banType;
    }

    public String getBanTitle() {
        return banTitle;
    }

    public void setBanTitle(String banTitle) {
        this.banTitle = banTitle;
    }

    public String getBanJumpType() {
        return banJumpType;
    }

    public void setBanJumpType(String banJumpType) {
        this.banJumpType = banJumpType;
    }

    public String getBanUrl() {
        return banUrl;
    }

    public void setBanUrl(String banUrl) {
        this.banUrl = banUrl;
    }

    public String getBanIcon() {
        return banIcon;
    }

    public void setBanIcon(String banIcon) {
        this.banIcon = banIcon;
    }

    public Integer getBanStatus() {
        return banStatus;
    }

    public void setBanStatus(Integer banStatus) {
        this.banStatus = banStatus;
    }

    public Integer getBanCreateTime() {
        return banCreateTime;
    }

    public void setBanCreateTime(Integer banCreateTime) {
        this.banCreateTime = banCreateTime;
    }

    public String getBanCreateUser() {
        return banCreateUser;
    }

    public void setBanCreateUser(String banCreateUser) {
        this.banCreateUser = banCreateUser;
    }

    public Integer getBanUpdateTime() {
        return banUpdateTime;
    }

    public void setBanUpdateTime(Integer banUpdateTime) {
        this.banUpdateTime = banUpdateTime;
    }

    public String getBanUpdateUser() {
        return banUpdateUser;
    }

    public void setBanUpdateUser(String banUpdateUser) {
        this.banUpdateUser = banUpdateUser;
    }
}
