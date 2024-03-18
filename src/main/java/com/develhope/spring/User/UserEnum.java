package com.develhope.spring.User;

public enum UserEnum {
    ADMIN("Admin"),
    SELLER("Seller"),
    CUSTOMER("Customer");

    private String string;

    UserEnum(String string){
        this.string = string;
    }

    @Override
    public String toString() {
        return this.toString();
    }
}
