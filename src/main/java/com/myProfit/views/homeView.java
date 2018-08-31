package com.myProfit.views;

import io.dropwizard.views.View;
import io.dropwizard.views.freemarker.*;

public class homeView extends View{
    private String userName;

    public homeView(String name) {
        super("homePage.ftl");
        this.userName = name;
    }

    public String getName() {
        return this.userName;
    }
}
