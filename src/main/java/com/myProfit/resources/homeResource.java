package com.myProfit.resources;

import io.dropwizard.views.freemarker.*;
import com.myProfit.views.homeView;
import com.myProfit.views.newSaleView;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/")
@Produces({MediaType.TEXT_HTML})
public class homeResource {

    public homeResource() {
        super();
    }

    @GET
    @Path("home")
    public homeView fetchHomeView() {
        return new homeView("Devon");
    }

    @GET
    @Path("newsale")
    public newSaleView fetchNewSale() {
        return new newSaleView();
    }
}
