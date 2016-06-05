package com.wicketproject;

import com.wicketproject.pages.admin.CreateUserPage;
import com.wicketproject.pages.admin.HomeAdminMenu;
import com.wicketproject.pages.admin.ViewResultPage;
import org.apache.wicket.markup.html.WebPage;
import com.wicketproject.pages.HomePage;
import com.wicketproject.pages.admin.CreateTestPage;

public abstract class BasePage extends WebPage {

    public BasePage() {
    add(new TwitterBootstrapNavBarPanel.Builder("navBar", HomePage.class, "Knowledge Testing", getActiveMenu())
            //.withMenuItem(MenuItemEnum.HOMEADMIN, HomeAdminMenu.class)
            .withMenuItem(MenuItemEnum.CREATETEST, CreateTestPage.class)
            .withMenuItem(MenuItemEnum.CREATEUSER, CreateUserPage.class)
            .withMenuItem(MenuItemEnum.RESULTPAGE, ViewResultPage.class)
            .build());
    }

    public abstract MenuItemEnum getActiveMenu();
    
}
