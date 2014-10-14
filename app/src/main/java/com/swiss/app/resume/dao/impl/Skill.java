package com.swiss.app.resume.dao.impl;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by avelife on 2014-10-08.
 */
public class Skill {
    @SerializedName("type")
    private String type;
    @SerializedName("name")
    private List<String> name;

    public Skill(String type,  List<String> name) {
        this.type = type;
        this.name = name;
    }
}
