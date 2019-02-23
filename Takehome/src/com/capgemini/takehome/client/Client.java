package com.capgemini.takehome.client;

import java.util.Scanner;

import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.exception.InvalidProductCodeException;
import com.capgemini.takehome.exception.InvalidProductQuantityException;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class Client {

	public static void main(String[] args)  {
		IProductService services=new ProductService();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product code");
		int productId=sc.nextInt();
		try {
			services.validateProductCode(productId);
		} catch (InvalidProductCodeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("enter product quantity");
		int qty=sc.nextInt();
		try {
			services.validateproductQuantity(qty);
		} catch (InvalidProductQuantityException e) {
			System.out.println(e.getMessage());
		}
try {
	System.out.println(services.getProductDetails(productId));
} catch (InvalidProductCodeException e){
	System.out.println(e.getMessage());
}
try {
	System.out.println(services.lineTotal(productId, qty));
} catch (InvalidProductCodeException e) {
	// TODO Auto-generated catch block
	System.out.println(e.getMessage());
}
}
	}


