package com.in.inh;

import com.in.abs.Discountable;
import com.in.enc.Product;

public class Gracery extends Product implements Discountable{

	private String expiryDate;

	public Gracery(String name, double price, String expiryDate) {
		super(name, price);
		this.expiryDate = expiryDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	@Override
	public String getDetails() {
		return super.getDetails()+", Expiry: "+expiryDate;
	}
	@Override
    public double applyDiscount(double percentage) {
        double discount = getPrice() * (percentage / 100);
        setPrice(getPrice() - discount);
        return getPrice();
    }

}
