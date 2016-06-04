package com.wicketproject;

import com.wicketproject.pages.admin.HomeAdminMenu;
import com.wicketproject.pages.student.StudentHomePage;
import com.wicketproject.pages.student.StudentMenu;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

/**
 * Created by ihor on 6/4/2016.
 */
public class AuthorizationPage extends WebPage {

    public AuthorizationPage() {
        add(new LoginForm("Authorization"));
    }

    public class LoginForm extends Form {
        private TextField usernameField;
        private PasswordTextField passwordField;
        private Label loginStatus;

        public LoginForm(String id) {
            super(id);

            usernameField = new TextField("username", Model.of(""));
            passwordField = new PasswordTextField("password", Model.of(""));
            loginStatus = new Label("loginStatus", Model.of(""));

            add(usernameField);
            add(passwordField);
            add(loginStatus);
        }

        public final void onSubmit() {
            String username = (String)usernameField.getDefaultModelObject();
            String password = (String)passwordField.getDefaultModelObject();

            if(username.equals("test") && password.equals("test"))
            {
                loginStatus.setDefaultModelObject("Congratulations!");
                setResponsePage(HomeAdminMenu.class);
            }else if(username.equals("st") && password.equals("st")) {
                setResponsePage(StudentHomePage.class);
            }else
                loginStatus.setDefaultModelObject("Wrong username or password!");
        }
    }
}

