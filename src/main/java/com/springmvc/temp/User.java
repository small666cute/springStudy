package com.springmvc.temp;

import java.util.List;

public class User {
    private String username;
    private String password;
    private String address;
    private boolean receivePaper;
    private List<String> favoriteStrings;
    private String country;
    private String[] skills;

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getFavoriteStrings() {
        return favoriteStrings;
    }

    public void setFavoriteStrings(List<String> favoriteStrings) {
        this.favoriteStrings = favoriteStrings;
    }

    public boolean isReceivePaper() {
        return receivePaper;
    }

    public void setReceivePaper(boolean receivePaper) {
        this.receivePaper = receivePaper;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
