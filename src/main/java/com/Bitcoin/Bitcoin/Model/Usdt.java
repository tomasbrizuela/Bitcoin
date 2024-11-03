package com.Bitcoin.Bitcoin.Model;

import java.math.BigDecimal;

public class Usdt {
    private BigDecimal ask;
    private double totalAsk;
    private double bid;
    private double totalBid;
    private long time;

    public Usdt(BigDecimal ask, double totalAsk, double bid, double totalBid, long time) {
        this.ask = ask;
        this.totalAsk = totalAsk;
        this.bid = bid;
        this.totalBid = totalBid;
        this.time = time;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public void setAsk(BigDecimal ask) {
        this.ask = ask;
    }

    public double getTotalAsk() {
        return totalAsk;
    }

    public void setTotalAsk(double totalAsk) {
        this.totalAsk = totalAsk;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public double getTotalBid() {
        return totalBid;
    }

    public void setTotalBid(double totalBid) {
        this.totalBid = totalBid;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

}
