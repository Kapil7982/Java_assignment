package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.ProductException;
import com.masai.model.Product;
import com.masai.model.ProductDTO;
import com.masai.service.ProductService;

@RestController
public class MyController {

	@Autowired
	private ProductService pdao;
	
	@PostMapping("/product")
	public ResponseEntity<Product> RegisterProduct(@RequestBody Product p) throws ProductException{
		
		Product prr=pdao.registerProduct(p);
		
		return  new ResponseEntity<Product>(prr,HttpStatus.CREATED);
	}
	
	@PutMapping("/product")
	public ResponseEntity<Product> UpdateProduct(@RequestBody Product p) throws ProductException{
		
		Product prr=pdao.updateProdcut(p);
		
		return new ResponseEntity<Product>(prr,HttpStatus.OK);
	}
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> AllProducts() throws ProductException{
		
		List<Product> li= pdao.getAllProducts();
		
		return new ResponseEntity<List<Product>>(li,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/product/{pid}")
	public ResponseEntity<Product> DeleteProduct(@PathVariable Integer pid) throws ProductException{
		Product p=pdao.deleteProductById(pid);
		
		return new ResponseEntity<Product>(p,HttpStatus.ACCEPTED);
	}
	@GetMapping("/product/{cat}")
	public ResponseEntity<List<Product>> AllProductsbycat(@PathVariable String cat) throws ProductException{
		
		List<Product> li= pdao.getsProductByCategory(cat);
		
		return new ResponseEntity<List<Product>>(li,HttpStatus.ACCEPTED);
	}
	@GetMapping("/productdto")
	public ResponseEntity<List<ProductDTO>> allproductdto() throws ProductException{
		List<ProductDTO> li=pdao.getProductNameQtyPrice();
		
		return new ResponseEntity<List<ProductDTO>>(li,HttpStatus.ACCEPTED);
	}
}
