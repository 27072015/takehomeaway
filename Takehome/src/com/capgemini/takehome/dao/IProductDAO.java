package com.capgemini.takehome.dao;

import com.capgemini.takehome.beans.Product;

public interface IProductDAO {
Product getProductDetails(int productCode);
}
