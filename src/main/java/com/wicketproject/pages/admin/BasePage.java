package com.wicketproject.pages.admin;

import com.wicketproject.MenuItemEnum;
import com.wicketproject.TwitterBootstrapNavBarPanel;
import com.wicketproject.pages.admin.CreateUserPage;
import com.wicketproject.pages.admin.HomeAdmin;
import org.apache.wicket.markup.html.WebPage;
import com.wicketproject.pages.HomePage;
import com.wicketproject.pages.admin.CreateTestPage;

public abstract class BasePage extends WebPage {

    public BasePage() {
    add(new TwitterBootstrapNavBarPanel.Builder("navBar", HomePage.class, "Tests app", getActiveMenu())
            .withMenuItem(MenuItemEnum.HOMEADMIN, HomeAdmin.class)
            .withMenuItem(MenuItemEnum.CREATETEST, CreateTestPage.class)
            .withMenuItem(MenuItemEnum.CREATEUSER, CreateUserPage.class)
            .withMenuItem(MenuItemEnum.PROFILE, ProfilePage.class)
            .build());
    }

    public abstract MenuItemEnum getActiveMenu();
    
}
