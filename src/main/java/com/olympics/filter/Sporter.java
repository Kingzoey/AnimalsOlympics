package com.olympics.filter;

public class Sporter {


    private String name;//姓名
    private String gender;//性别


    public Sporter(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Sporters [name=" + name + ", gender=" + gender + "]";
    }


}
