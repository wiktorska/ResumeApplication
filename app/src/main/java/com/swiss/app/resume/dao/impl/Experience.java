package com.swiss.app.resume.dao.impl;

import com.google.gson.annotations.SerializedName;

/**
 * Created by avelife on 2014-10-08.
 */
public class Experience {
    @SerializedName("companyName")
    private String companyName;
    @SerializedName("date")
    private String date;
    @SerializedName("description")
    private String description;
    @SerializedName("position")
    private String position;

    public Experience(String companyName, String startDate, String description, String position) {
        this.companyName = companyName;
        this.date = startDate;
        this.description = description;
        this.position = position;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
