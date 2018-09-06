package com.myProfit.views;

import io.dropwizard.views.View;
import io.dropwizard.views.freemarker.*;

public class newSaleView extends View{
    public newSaleView() {
        super("addNewSale.ftl");
    }
}
