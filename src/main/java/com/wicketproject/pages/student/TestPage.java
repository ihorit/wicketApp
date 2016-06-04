package com.wicketproject.pages.student;

import com.wicketproject.MenuItemEnum;

/**
 * Created by it01 on 04.06.16.
 */
public class TestPage extends StudentMenu {
    public MenuItemEnum getActiveMenu() {
        return MenuItemEnum.USERTEST;
    }
}
