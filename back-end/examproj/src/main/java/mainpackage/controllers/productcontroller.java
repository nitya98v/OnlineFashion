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

import mainpackage.models.pimodel;
import mainpackage.models.product;
import mainpackage.repositories.XRepository_cart2;
import mainpackage.repositories.XRepository_product;

@CrossOrigin(origins = "*") 
@RestController
public class productcontroller {
	
	private XRepository_product r;
	
	
	@Autowired
	public void f1(XRepository_product y)
	{ 
		System.out.println("autowired successfully");
		r =y;
		
	}
	
	

	
	@PostMapping("/ms")
	public List<product> f3(@RequestBody pimodel pi)
	{

		return r.oncat(pi.getCid());
		
	}
	
}
