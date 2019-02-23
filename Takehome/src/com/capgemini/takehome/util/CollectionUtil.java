package com.capgemini.takehome.util;

import java.util.HashMap;

import com.capgemini.takehome.beans.Product;


public class CollectionUtil {
private static HashMap<Integer, Product>products=new HashMap<Integer, Product>();
static {
	getProducts().put(1001, new Product(1001,"iPhone","Electronics",35000));
	getProducts().put(1002, new Product(1002,"Led","Electronics",350));
	getProducts().put(1003, new Product(1003,"TeddyBear","Toys",500));
	getProducts().put(1004, new Product(1004,"Telescope","Toys",500));
}
public static HashMap<Integer, Product> getProducts() {
	return products;
}
public static void setProducts(HashMap<Integer, Product> products) {
	CollectionUtil.products = products;
}

}
