package com.company;

public class Address {
    public String country;
    public String city;
    public int postalCode;
    public String streetName;
    public int houseNumb;

    public String createAddress (String country){
        return String.format("country: %s", country);
    }
    public String createAddress (String city, String country){
        return String.format("You live in %s, %s, ", city, country);
    }
    public String createAddress (String city, String country, int postalCode){
        return String.format("You live in %s, : %s, %d", city, country, postalCode);
    }
    public String createAddress (String streetName, String city, String country, int postalCode){
        return String.format("You live in %s, %s, %s, %d", streetName, city, country, postalCode);
    }
    public String createAddress (String country, String city, int postalCode, String streetName, int houseNumb){
        return String.format("You live in %s, %s, %s, %d, %d", streetName, city, country, postalCode, houseNumb);
    }
}
