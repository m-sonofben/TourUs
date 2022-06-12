package com.example.android.tourus;

public class Attraction {

    private String attractionName;

    private String attractionHours;

    private String attractionAddress;

    private String attractionPrice;

    private String attractionPhoneNumber;

    private int attractionDescription;

    private int attractionImageResourceId;

    public Attraction(String name, String hours, String address, String price, String phoneNumber, int description, int imageResourceId) {
        attractionName = name;
        attractionHours = hours;
        attractionAddress = address;
        attractionPrice = price;
        attractionPhoneNumber = phoneNumber;
        attractionDescription = description;
        attractionImageResourceId = imageResourceId;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public String getAttractionHours() {
        return attractionHours;
    }

    public String getAttractionAddress() {
        return attractionAddress;
    }

    public String getAttractionPrice() {
        return attractionPrice;
    }

    public String getAttractionPhoneNumber() {
        return attractionPhoneNumber;
    }

    public int getAttractionDescription() {
        return attractionDescription;
    }

    public int getAttractionImageResourceId() {
        return attractionImageResourceId;
    }

























}
