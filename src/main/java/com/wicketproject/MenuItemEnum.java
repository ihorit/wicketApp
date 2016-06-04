package com.wicketproject;

public enum MenuItemEnum {

    HOMESTUDENT("Home"),
    HOMEADMIN("Home"),
    PROFILE("Profile"),
    USERTEST("Test"),
    CREATETEST("Create Test"),
    CREATEUSER("Students Registration"),
    STUDENTPROFILE("Profile"),
    NONE("");

    private String label;

    private MenuItemEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
}
