package com.wicketproject;

import com.wicketproject.pages.admin.CreateUserPage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import com.wicketproject.pages.student.StudentHomePage;
import com.wicketproject.pages.admin.CreateTestPage;

public class WicketApplication extends WebApplication {

    @Override
    public Class<? extends WebPage> getHomePage() {
        return AuthorizationPage.class;
    }

    @Override
    public void init() {
        mountPage("student", StudentHomePage.class);
        mountPage("createuser", CreateUserPage.class);
//        mountPage("skills", OurSkillsPage.class);
        mountPage("createtestpage", CreateTestPage.class);

        getMarkupSettings().setStripWicketTags(true);
        setExternalHtmlDirIfSystemPropertyIsPresent();
    }

    private void setExternalHtmlDirIfSystemPropertyIsPresent() {
        String externalDir = System.getProperty("wicket.html.dir");
        if (externalDir != null) {
            getResourceSettings().addResourceFolder(externalDir);
        }
    }
}
