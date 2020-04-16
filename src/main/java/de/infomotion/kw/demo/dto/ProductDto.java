package de.infomotion.kw.demo.dto;


import de.infomotion.kw.demo.model.kwdb.Order;
import de.infomotion.kw.demo.model.kwdb.Product;
import de.infomotion.kw.demo.model.summerwine.SummerwineOrder;
import de.infomotion.kw.demo.model.summerwine.SummerwineProduct;

import java.util.ArrayList;
import java.util.List;

public class ProductDto {

    private List<SummerwineProduct> summerwineProductList;
    private List<Product> productList = new ArrayList<>();

    public ProductDto(List<SummerwineProduct> summerwineProductList) {
        this.summerwineProductList = summerwineProductList;
    }

    public void transferObject() {
        summerwineProductList.forEach(summerwineProduct -> {
            Product product = new Product();
            product.setProductNumber(summerwineProduct.getProductNumber());
            product.setProductName(summerwineProduct.getProductName());
            product.setOrigin(summerwineProduct.getOrigin());
            product.setPurchasePrice(summerwineProduct.getPurchasePrice());
            product.setSellingPrice(summerwineProduct.getSellingPrice());
            product.setVarietyMark(summerwineProduct.getVarietyMark());
            product.setVintage(summerwineProduct.getVintage());

            productList.add(product);

        });
    }

    public List<Product> getProductList() {
        return productList;
    }

}


