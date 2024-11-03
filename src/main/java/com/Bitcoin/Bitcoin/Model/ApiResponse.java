package com.Bitcoin.Bitcoin.Model;

import java.math.BigDecimal;

public class ApiResponse {

    private String coin;
    private BigDecimal price;

    public ApiResponse(String coin, BigDecimal price) {
        this.coin = coin;
        this.price = price;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[coin=" + coin + ", price=" + price + "]";
    }

}
