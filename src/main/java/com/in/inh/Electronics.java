package com.in.inh;

import com.in.enc.Product;

public class Electronics extends Product{

	private int warrantyInMonths;

	public Electronics(String name, double price, int warrantyInMonths) {
		super(name, price);
		this.warrantyInMonths = warrantyInMonths;
	}

	public int getWarrantyInMonths() {
		return warrantyInMonths;
	}

	@Override
	public String getDetails() {
		return super.getDetails()+" ,Warranty: "+warrantyInMonths+"months";
	}


}
