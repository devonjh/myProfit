package com.myProfit;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class myProfitApplicationApplication extends Application<myProfitApplicationConfiguration> {

    public static void main(final String[] args) throws Exception {
        new myProfitApplicationApplication().run(args);
    }

    @Override
    public String getName() {
        return "myProfitApplication";
    }

    @Override
    public void initialize(final Bootstrap<myProfitApplicationConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final myProfitApplicationConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
