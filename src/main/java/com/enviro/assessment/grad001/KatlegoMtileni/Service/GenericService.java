package com.enviro.assessment.grad001.KatlegoMtileni.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.KatlegoMtileni.Repository.GenericRepository;

@Service
public class GenericService<T, ID> {

	private final GenericRepository<T, ID> repository;

	//Receives an instance of the specific repository to communicate the database with
    public GenericService(GenericRepository<T, ID> repository) {
        this.repository = repository;
    }

	public T save(T entity) {
        return repository.save(entity);
    }

    public T update(T entity) {
        return repository.save(entity); // Same as save for JPA
    }

    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public void delete(T entity) {
        repository.delete(entity);
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}
