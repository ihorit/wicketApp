package com.wicketproject.pages.student;

import com.wicketproject.MenuItemEnum;
import com.wicketproject.TwitterBootstrapNavBarPanel;
import com.wicketproject.pages.HomePage;
import com.wicketproject.pages.admin.CreateTestPage;
import com.wicketproject.pages.profiles.StudentProfilePage;
import org.apache.wicket.markup.html.WebPage;

/**
 * Created by ihor on 6/4/2016.
 */
public abstract class StudentMenu extends WebPage {
    public StudentMenu() {
        add(new TwitterBootstrapNavBarPanel.Builder("navBar", StudentHomePage.class, "Tests app", getActiveMenu())
                .withMenuItem(MenuItemEnum.HOMESTUDENT, StudentHomePage.class)
                .withMenuItem(MenuItemEnum.USERTEST, TestPage.class)
                .withMenuItem(MenuItemEnum.STUDENTPROFILE, StudentProfilePage.class)
                .build());
    }

    public abstract MenuItemEnum getActiveMenu();
}
