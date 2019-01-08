package com.target.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.target.model.Cab;

@Repository
public interface CabRepository extends CrudRepository<Cab, String> {

}
