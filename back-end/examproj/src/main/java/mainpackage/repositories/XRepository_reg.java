package mainpackage.repositories;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mainpackage.models.reg;

@Repository 
public interface XRepository_reg extends JpaRepository<reg, Integer>{
	@Query("from reg where regid  =:x")
	List<reg> oncat(@Param("x") int x);

	reg findByemailid(String emailid);

}

