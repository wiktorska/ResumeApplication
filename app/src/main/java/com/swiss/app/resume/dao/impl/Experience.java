package com.swiss.app.resume.dao.impl;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by avelife on 2014-10-08.
 */
public class Experience {
    @SerializedName("companyName")
    private String companyName;
    @SerializedName("startDate")
    private String startDate;
    @SerializedName("endDate")
    private String endDate;
    @SerializedName("description")
    private String description;
    @SerializedName("position")
    private String position;

    public Experience(String companyName, String startDate, String endDate, String description, String position) {
        this.companyName = companyName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.position = position;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
