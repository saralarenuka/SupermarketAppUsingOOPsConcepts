package com.in;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in.abs.Discountable;
import com.in.enc.Product;
import com.in.inh.Electronics;
import com.in.inh.Gracery;

@SpringBootApplication
public class SuperMarketProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperMarketProjectApplication.class, args);
		
		        List<Product> p1 = Arrays.asList(new Gracery("Milk", 45, "2025-09-01"),
		        		new Gracery("Curd", 10, "2025-09-01"),
		        		new Gracery("Chocolate", 100, "2025-09-01")
		        		);
		        Product p2 = new Electronics("Headphones", 4500.00, 12);

		        for (Product p : p1) {
					System.out.println(p.getDetails());
					
					 if (p instanceof Discountable) {
				            ((Discountable) p).applyDiscount(10);  
				            System.out.println("Discounted price: " + (p.getPrice()));
				        }
				}
		        
		        System.out.println(p2.getDetails());

		       
		    }
		

}
