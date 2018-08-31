package com.myProfit;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;

public class myProfitApplicationConfiguration extends Configuration {
    //@NotEmpty
    private String game;

    @JsonProperty
    public String getGame() {
        return this.game;
    }

    @JsonProperty
    public void setGame(String gameName) {
        this.game = gameName;
    }
}
