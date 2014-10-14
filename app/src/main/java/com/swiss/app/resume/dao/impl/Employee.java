package com.swiss.app.resume.dao.impl;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by avelife on 2014-10-08.
 */
public class Employee {
    @SerializedName("name")
    private String name;
    @SerializedName("surname")
    private String surname;
    @SerializedName("mail")
    private String mail;
    @SerializedName("phoneNumber")
    private String phoneNumber;
    @SerializedName("description")
    private String description;
    @SerializedName("profession")
    private String profession;

    private Address address;
    private List<Experience> experienceList;
    private List<Skill> skillsList;
    private List<Education> educationList;
    private static Employee instance;

    private Employee(){

    }

    public static void setInstance(Employee instance) {
        Employee.instance = instance;
    }

    public static Employee getData(){
        if(instance==null){
            synchronized (Employee.class){
                if(instance==null){
                    instance = new Employee();
                }
            }

        }
        return instance;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public List<Education> getEducationList() {
        return educationList;
    }

    public void setEducationList(List<Education> educationList) {
        this.educationList = educationList;
    }
    public List<Experience> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }

    public List<Skill> getSkillsList() {
        return skillsList;
    }

    public void setSkillsList(List<Skill> skillsList) {
        this.skillsList = skillsList;
    }

    public List<Education> getEductaionList() {
        return educationList;
    }

    public void setEductaionList(List<Education> eductaionList) {
        this.educationList = eductaionList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
