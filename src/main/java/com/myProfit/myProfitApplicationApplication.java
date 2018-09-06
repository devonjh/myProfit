package com.myProfit;

import com.myProfit.resources.homeResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import io.dropwizard.assets.AssetsBundle;

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
        bootstrap.addBundle(new AssetsBundle());
        bootstrap.addBundle(new ViewBundle<myProfitApplicationConfiguration>());
    }

    @Override
    public void run(final myProfitApplicationConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new homeResource());
    }
}
