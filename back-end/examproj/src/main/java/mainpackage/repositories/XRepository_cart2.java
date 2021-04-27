package mainpackage.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mainpackage.models.cart2;




@Repository 
 public interface XRepository_cart2 extends JpaRepository<cart2, Integer>{

	@Query("from cart2 where email =:x")
	List<cart2> oncat(@Param("x") int y);
}


