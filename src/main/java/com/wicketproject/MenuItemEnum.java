package com.wicketproject;

public enum MenuItemEnum {

    HOMESTUDENT("Home"),
    HOMEADMIN("Home"),
    USERTEST("Test"),
    ABOUT_US("About us"),
    CREATETEST("Create Test"),
    CREATEUSER("Students Registration"),
    RESULTPAGE("View Results"),
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
