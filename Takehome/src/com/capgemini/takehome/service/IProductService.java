package com.capgemini.takehome.service;

import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.exception.InvalidProductCodeException;
import com.capgemini.takehome.exception.InvalidProductQuantityException;

public interface IProductService {
Product getProductDetails(int productCode)throws InvalidProductCodeException;
boolean validateproductQuantity(int qty)throws InvalidProductQuantityException;
boolean validateProductCode(int productCode)throws InvalidProductCodeException;
float lineTotal(int productCode,int qty) throws InvalidProductCodeException;
}
