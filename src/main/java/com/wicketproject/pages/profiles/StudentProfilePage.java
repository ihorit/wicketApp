package com.wicketproject.pages.profiles;

import com.wicketproject.pages.admin.BasePage;
import com.wicketproject.MenuItemEnum;
import com.wicketproject.pages.student.StudentMenu;

public class StudentProfilePage extends StudentMenu {

    @Override
    public MenuItemEnum getActiveMenu() {
        return MenuItemEnum.STUDENTPROFILE;
    }
}
