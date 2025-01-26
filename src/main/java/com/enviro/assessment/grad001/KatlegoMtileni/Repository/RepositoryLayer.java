package com.enviro.assessment.grad001.KatlegoMtileni.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@Repository
public interface RepositoryLayer<T, ID extends Serializable> extends JpaRepository<T, ID> {
	//Additional Common Methods Come Here
}
