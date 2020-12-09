package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BugDetail;
import com.example.demo.service.BugService;

@RestController
@CrossOrigin(origins = "*")
public class BugController {

	@Autowired
	private BugService service;
	
	@GetMapping(path="/api/rest/issues")
	public List<BugDetail> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path="/api/rest/issue/{issueId}")
	public Optional<BugDetail> findById(@PathVariable("issueId") int id)
	{
		return this.service.findById(id);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(path="api/rest/issues")
	public BugDetail addBug(@RequestBody BugDetail bugDetail) {
		return this.service.add(bugDetail);
	}
	
	@GetMapping(
	         path="/api/rest/issues/{page}/{size}")
	    public List<BugDetail> findByPage(
	     @PathVariable("page") int page, 
	     @PathVariable("size") int size)
	      {
	       return this.service.findByPage (page,size);
	   }

	
		
	}