package com.example.community;

public class MemberInfo {

    private String name;
    private String phoneNum;
    private String birthDay;
    private String address;
    private String photoUrl;

    public MemberInfo(String name, String phoneNum, String birthDay, String address, String photoUrl){
        this.name = name;
        this.phoneNum = phoneNum;
        this.birthDay = birthDay;
        this.address = address;
        this.photoUrl = photoUrl;
    }

    public MemberInfo(String name, String phoneNum, String birthDay, String address){
        this.name = name;
        this.phoneNum = phoneNum;
        this.birthDay = birthDay;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPhoneNum(){
        return this.phoneNum;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    public String getBirthDay(){
        return this.birthDay;
    }
    public void setBirthDay(String birthDay){
        this.birthDay = birthDay;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getPhotoUrl(){
        return this.photoUrl;
    }
    public void setPhotoUrl(String photoUrl){
        this.photoUrl = photoUrl;
    }
}
