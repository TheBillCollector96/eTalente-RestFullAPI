package com.enviro.assessment.grad001.KatlegoMtileni.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
@NoRepositoryBean
public interface GenericRepository<T, ID> extends JpaRepository<T, ID>  {

	
}
