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

import mainpackage.models.ApiResponse;
import mainpackage.models.reg;
import mainpackage.repositories.XRepository_reg;
import mainpackage.models.login;

@CrossOrigin(origins="*")
@RestController
public class regcontroller {

	

	private XRepository_reg r;
	
	@Autowired
	public void f1(XRepository_reg y)
	{ 
		System.out.println("autowired successfully");
		r =y;
		
	}
	@PostMapping("/arreg")
	public reg ins(@RequestBody reg x)
	{
		System.out.println(x.getRegid());
		if(r.existsById(x.getRegid()))
		{
			x.setRegid(0);
			
		}
		else
				r.save(x);
		
        
        this.r.save(x);

		return x;
		
	}	
		
	@PostMapping("/login")
	public ApiResponse login(@RequestBody login l)
	{
		System.out.println(l);
	  reg o=r.findByemailid(l.getEmailid());
	  if(o==null)
	  {
		return  new ApiResponse(0, "User does not exist") ;
	  }
	  if(!o.getPassword().equals(l.getPassword())){
		  return  new ApiResponse(-1, "password mismatch") ;
      }
      return new ApiResponse(1,"Login success") ;

		
		
	}

	
	
	
}
