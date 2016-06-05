package com.wicketproject.pages;


import com.wicketproject.MenuItemEnum;
import com.wicketproject.pages.admin.HomeAdmin;

public class HomePage extends HomeAdmin {


    @Override
    public MenuItemEnum getActiveMenu() {
        return MenuItemEnum.NONE;
    }
}
