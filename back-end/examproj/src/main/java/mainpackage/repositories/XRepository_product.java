package mainpackage.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mainpackage.models.product;


@Repository 
 public interface XRepository_product extends JpaRepository<product,String>{

	@Query("from product where cid = :x")
	List<product> oncat(@Param("x") String y);
}


