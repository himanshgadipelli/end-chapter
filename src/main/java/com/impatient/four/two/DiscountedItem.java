package com.impatient.four.two;

import java.util.Objects;

/**
 * Created by bobby on 1/29/2017.
 */
public class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount){
        super(description, price);
        this.discount = discount;
    }

    public boolean equal(Object otherObject){
        if (!super.equals(otherObject)) return false;
        DiscountedItem other = (DiscountedItem) otherObject;
        return discount == other.discount;
    }

    public int hashCode(){
        return Objects.hash(super.hashCode(), discount);
    }
}
