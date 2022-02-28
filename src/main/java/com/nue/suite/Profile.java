package com.nue.suite;

public class Profile {

    private final String username;
    private final String name;
    private final String about;

    @Override
    public String toString() {
        return "Profile{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", websiteLink='" + websiteLink + '\'' +
                '}';
    }

    private final String websiteLink;

    public Profile(String username, String name, String about, String websiteLink) {
        this.username = username;
        this.name = name;
        this.about = about;
        this.websiteLink = websiteLink;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }

    public String getWebsiteLink() {
        return websiteLink;
    }
}
