package com.company;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String str) {
        String[] arr;
        String[] d = {"- ", ", ", "; ", ". "};
        int i = 0;
        arr = str.split(d[i]);
        while (arr.length < 7 && i < 3){
            i++;
            arr = str.split(d[i]);
        }
        if (arr.length < 7){
            this.country = "error";
            this.region = "error";
            this.city = "error";
            this.street = "error";
            this.house = "error";
            this.building = "error";
            this.apartment = "error";
        } else {
            this.country = arr[0];
            this.region = arr[1];
            this.city = arr[2];
            this.street = arr[3];
            this.house = arr[4];
            this.building = arr[5];
            this.apartment = arr[6];
        }
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getBuilding() {
        return building;
    }

    public String getApartment() {
        return apartment;
    }

    @Override
    public String toString() {
        return country + "|" + region + "|" + city + "|" + street + "|" +
                house + "|" + building + "|" + apartment;
    }
}
