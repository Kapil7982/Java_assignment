package com.masai.service;

import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.ProductException;
import com.masai.model.Product;
import com.masai.model.ProductDTO;
import com.masai.repo.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao dao; 
	
	@Override
	public Product registerProduct(Product p) throws ProductException {
		
		Product pr=dao.save(p);
		if(pr!=null)
			return pr;
		else 
			throw new ProductException("Product didn't registeer");
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {
		
		List<Product> list=dao.findAll();
		if(list.size()>0)
			return list;
		else
			throw new ProductException("No product found");
	}

	@Override
	public Product updateProdcut(Product p) throws ProductException {
		
		Optional<Product> opt=dao.findById(p.getProductId());
		  if(opt.isPresent()) {
			 return dao.save(p);
		  }
			  
		
			else 
				throw new ProductException("Product didn't registeer");
	}

	@Override
	public Product deleteProductById(Integer pid) throws ProductException {
		
		Optional<Product> opt=dao.findById(pid);
		  if(opt.isPresent()) {
			  Product pr=opt.get();
			 dao.delete(pr);
			 return pr;
		  }
			  
		
			else 
				throw new ProductException("Product didn't present");
	}

	@Override
	public List<Product> getsProductByCategory(String category) throws ProductException {
		
		List<Product> li=dao.findByCategory(category);
		if(li.size()>0) {
			return li;
		}
		else
			throw new ProductException("Not any product available");
	}

	@Override
	public List<ProductDTO> getProductNameQtyPrice() throws ProductException {
		
		List<ProductDTO> li=dao.getProductNameQtyPrice();
		if(li.size()>0)
			return li;
		else
			throw new ProductException("Not any product available");

    }
}
