package com.swiss.app.resume.dao.impl;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by avelife on 2014-10-08.
 */
public class Education {
    @SerializedName("startDate")
    private String startDate;
    @SerializedName("endDate")
    private String endDate;
    @SerializedName("major")
    private String major;


    @SerializedName("schoolName")
    private String schoolName;
    @SerializedName("faculty")
    private String faculty;
    @SerializedName("fieldOfStudy")
    private String fieldOfStudy;
    @SerializedName("degree")
    private String degree;

    public Education(String startDate, String endDate, String major, String schoolName, String faculty, String fieldOfStudy, String degree) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.major = major;
        this.schoolName = schoolName;
        this.faculty = faculty;
        this.fieldOfStudy = fieldOfStudy;
        this.degree = degree;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getMajor() {
        return major;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDegree() {
        return degree;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }
}
