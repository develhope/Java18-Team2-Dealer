package com.develhope.spring;

public class Purchase {
    int deposit;
    boolean payed;
    String status;
    String orderOrSell;

    public Purchase(int deposit, boolean payed, String status, String orderOrSell) {
        this.deposit = deposit;
        this.payed = payed;
        this.status = status;
        this.orderOrSell = orderOrSell;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderOrSell() {
        return orderOrSell;
    }

    public void setOrderOrSell(String orderOrSell) {
        this.orderOrSell = orderOrSell;
    }
}
