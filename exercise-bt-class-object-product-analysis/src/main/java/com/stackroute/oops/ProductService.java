package com.stackroute.oops;

import java.util.Arrays;

/*
    Class for Analyzing the products present in ProductRepository
 */
public class ProductService {

    /*
        Returns the name of the product given the productCode
     */
    public String findProductNameByCode(int productCode) {
        for (Product product : ProductRepository.getProducts()) {
            if (product.getProductCode() == productCode) {
                return product.getName();
            }
        }
        return null;
    }

    /*
        Returns the Product with maximum price in a given category
     */
    public Product findMaxPriceProductInCategory(String category) {
        Product[] products = ProductRepository.getProducts();
        Product maxPriceProduct = null;
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                if (maxPriceProduct == null || product.getPrice() > maxPriceProduct.getPrice()) {
                    maxPriceProduct = product;
                }
            }
        }
        return maxPriceProduct;
    }

    /*
        Returns an array of products for a given category
     */
    public Product[] getProductsByCategory(String category) {
        Product[] products = ProductRepository.getProducts();
        Product[] categoryProducts = new Product[0];
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                categoryProducts = Arrays.copyOf(categoryProducts, categoryProducts.length + 1);
                categoryProducts[categoryProducts.length - 1] = product;
            }
        }
        if (categoryProducts.length == 0) {
            return null;
        }
        return categoryProducts;
    }
}
