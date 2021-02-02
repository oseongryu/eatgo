package com.tistory.f5074.eatgo.domain;

public class Restaurant {
    private final String name;
    private final String address;


    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
//        return "Bob zip";
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getInformation() {
        return name + "in " + address;
    }
}
