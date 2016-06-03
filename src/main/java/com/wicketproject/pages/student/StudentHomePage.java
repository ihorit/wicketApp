package com.wicketproject.pages.student;

import com.wicketproject.BasePage;
import com.wicketproject.MenuItemEnum;

public class StudentHomePage extends StudentMenu {

    @Override
    public MenuItemEnum getActiveMenu() {
        return MenuItemEnum.HOMESTUDENT;
    }
}
