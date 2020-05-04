package com.uca.TareaL3.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.TareaL3.domain.Product;



@Controller
public class ProductController {
	private List<Product> prodcuts = new ArrayList<>();
	
	
	

	@GetMapping(path="/compraProducto")
	public ModelAndView  compraProducto(){
		prodcuts.add(new Product(0,"AVAST","96"));
		prodcuts.add(new Product(1,"McAfee","420"));
		prodcuts.add(new Product(2,"ESSET","90"));
		prodcuts.add(	new Product(3,"WindowsDefender","10"));
		prodcuts.add(new Product(4,"CommomSense2030-10TM","690"));
				
					
		ModelAndView mav = new ModelAndView();
		mav.setViewName("select");
		mav.addObject("product", new Product());
		mav.addObject("products",this.prodcuts);
		return mav;
	}
	
	
	@PostMapping(path="/validar")
	public ModelAndView validar(Product product, @RequestParam String cantidad){
		ModelAndView mav = new ModelAndView();
		String nombre = this.prodcuts.get(product.getId()).getNombre();
		Integer a = Integer.parseInt(this.prodcuts.get(product.getId()).getCantidad());
		if(Integer.parseInt(cantidad) > a) {
			mav.setViewName("error");
			mav.addObject("producto", nombre);
		}else {
			mav.setViewName("compra");
			mav.addObject("producto", nombre);
			
		}
		
		
		return mav;
	}
	
	

}
