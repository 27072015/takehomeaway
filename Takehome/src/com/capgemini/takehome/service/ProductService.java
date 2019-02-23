package com.capgemini.takehome.service;

import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exception.InvalidProductCodeException;
import com.capgemini.takehome.exception.InvalidProductQuantityException;

public class ProductService implements IProductService {
IProductDAO productDAO=new ProductDAO();
	@Override
	public Product getProductDetails(int productCode)throws InvalidProductCodeException {
		Product product=productDAO.getProductDetails(productCode);
		if(product==null)
		throw new InvalidProductCodeException("Prodcut not found");
		return product;
	}

	@Override
	public boolean validateproductQuantity(int qty) throws InvalidProductQuantityException {
		if(qty>0)
			return true;
		else throw new InvalidProductQuantityException("not valid quantity");
	}

	@Override
	public boolean validateProductCode(int productId) throws InvalidProductCodeException {
		if((productId>=1000)&&(productId<=9999)) 
			return true;
		else throw new InvalidProductCodeException("invalid product code");
	}

	@Override
	public float lineTotal(int productCode, int qty) throws InvalidProductCodeException  {
	Product product = getProductDetails(productCode);
		
		float total=product.getProductPrice()*qty;
		return total;
		
	}

}
