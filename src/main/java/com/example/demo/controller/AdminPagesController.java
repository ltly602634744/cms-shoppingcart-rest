package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Page;
import com.example.demo.model.PageRepository;

@RestController
@RequestMapping(path = "/admin/pages", produces = "application/json")
@CrossOrigin("*")
public class AdminPagesController {

	@Autowired
	private PageRepository pageRepo;
	
	@GetMapping
	public Iterable<Page> index() {
		
		List<Page> pages = pageRepo.findAllByOrderBySortingAsc();
		
		return pages;
	}
	
	@PostMapping(path = "/add", consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Page add(@RequestBody Page page) {
		return pageRepo.save(page);
	}
	
	
	
	
	
	
	
	
	
	
}
