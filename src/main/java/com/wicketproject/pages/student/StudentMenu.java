package com.wicketproject.pages.student;

import com.wicketproject.MenuItemEnum;
import com.wicketproject.TwitterBootstrapNavBarPanel;
import org.apache.wicket.markup.html.WebPage;

/**
 * Created by ihor on 6/4/2016.
 */
public abstract class StudentMenu extends WebPage {
    public StudentMenu() {
        add(new TwitterBootstrapNavBarPanel.Builder("navBar", StudentHomePage.class, "Knowledge Testing", getActiveMenu())
                .withMenuItem(MenuItemEnum.HOMESTUDENT, StudentHomePage.class)
                .build());
    }

    public abstract MenuItemEnum getActiveMenu();
}
