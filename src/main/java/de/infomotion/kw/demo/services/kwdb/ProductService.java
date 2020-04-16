package de.infomotion.kw.demo.services.kwdb;

import de.infomotion.kw.demo.model.kwdb.Product;
import de.infomotion.kw.demo.repository.kwdb.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

	private List<Product> productList;

	@Autowired
	ProductRepository productRepository;

	public void saveProducts() {
		productRepository.saveAll(productList);
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
}
