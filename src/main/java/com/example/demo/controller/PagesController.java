package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Page;
import com.example.demo.model.PageRepository;


@RestController
@RequestMapping(path = "/pages", produces = "application/json")
@CrossOrigin("*")
public class PagesController {
	
	@Autowired
	private PageRepository pageRepo;

	@GetMapping("/all")
	public Iterable<Page> pages() {
		
		List<Page> pages = pageRepo.findAllByOrderBySortingAsc();
		
		return pages;
	}
	
	
	
	
	
	
	
	
	
	
}
