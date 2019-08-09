package com.mms.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mms.deloitte.dao.MovieDAO;
import com.mms.deloitte.model.Movie;


@RestController
public class MovieController {
	@Autowired
	MovieDAO movieDAO;
	
	@RequestMapping("/getMovie")
	public String getProduct() {
		return "Congrats, getting movie details";
	}
	
	@RequestMapping("/saveMovie")
	public String saveMovie() {
		Movie movie = new Movie(123,"KKHH","Kjo",1);
		movieDAO.save(movie);
		return "Saved movie details";
	}
}
