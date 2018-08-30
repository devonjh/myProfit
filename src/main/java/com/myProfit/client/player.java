package com.myProfit.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class player {

    //Class Variables
    private String playerName;
    private Integer purchasePrice;
    private Integer salePrice;

    public player() {
    }

    public player(String name, Integer purchase, Integer sale) {
        this.playerName = name;
        this.purchasePrice = purchase;
        this.salePrice = sale;
    }

    @JsonProperty
    public String getPlayerName() {
        return this.playerName;
    }
}
