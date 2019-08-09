package com.mms.deloitte.dao;

import org.springframework.data.repository.CrudRepository;

import com.mms.deloitte.model.Movie;


public interface MovieDAO extends CrudRepository<Movie, Integer>{
	

}
