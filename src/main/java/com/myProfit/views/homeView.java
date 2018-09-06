package com.myProfit.views;

        import io.dropwizard.views.View;
        import io.dropwizard.views.freemarker.*;

public class homeView extends View{
    private final String username;

    public homeView(String name) {
        super("landingPage.ftl");
        this.username = name;
    }

    public String getUsername() {
        return this.username;
    }
}
