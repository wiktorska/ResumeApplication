package com.swiss.app.resume.dao.impl;

import com.google.gson.annotations.SerializedName;

/**
 * Created by avelife on 2014-10-08.
 */
public class Address {
    @SerializedName("street")
    private String street;
    @SerializedName("streetNumber")
    private String streetNumber;
    @SerializedName("homeNumber")
    private String homeNumber;
    @SerializedName("postNumber")
    private String postNumber;
    @SerializedName("country")
    private String country;

    public Address(String street, String streetNumber, String homeNumber, String postNumber, String country) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.homeNumber = homeNumber;
        this.postNumber = postNumber;
        this.country = country;
    }
}
