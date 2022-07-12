package com.chima.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chima.demo.api.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, String> {

}
