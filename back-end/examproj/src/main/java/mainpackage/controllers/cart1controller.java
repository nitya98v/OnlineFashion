package mainpackage.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mainpackage.models.cart1;
import mainpackage.repositories.XRepository_cart1;

@CrossOrigin(origins = "*")  // connecting hibernate with angular
@RestController
public class cart1controller {
	
	private XRepository_cart1 r;
	
	
	@Autowired
	public void f1(XRepository_cart1 y)
	{ 
		System.out.println("autowired successfully");
		r =y;
		
	}
	
	
	
	
	
	@PostMapping("/acart")
	public cart1 ins(@RequestBody cart1 x)
	{
		System.out.println(x);
		if(r.existsById(x.getCartid()))
		{
			x.setCartid(0);
			
		}
		else
				r.save(x);
		
		return x;
		
		
	}
}
	