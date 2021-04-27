package mainpackage.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mainpackage.models.cart1;




@Repository 
 public interface XRepository_cart1 extends JpaRepository<cart1, Integer>{

	@Query("from cart1 where cartid=:x")
	List<cart1> oncat(@Param("x") int y);
}


