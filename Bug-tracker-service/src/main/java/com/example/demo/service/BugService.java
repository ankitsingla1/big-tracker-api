package com.example.demo.service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BugDetail;
import com.example.demo.ifaces.BugRepository;



@Service
public class BugService {

	@Autowired
	private BugRepository repo;

	public List<BugDetail> findAll(){
		return this.repo.findAll();
	}

	public Optional<BugDetail> findById(int id) {
		Optional<BugDetail> bug=repo.findById(id);
		return bug;	}

	public BugDetail add(BugDetail entity) {
		return this.repo.save(entity);
	}

	public List<BugDetail> findByPage(int page, int size){

		PageRequest pageRequest = PageRequest.of(page, size);
		Page<BugDetail> pageResult = repo.findAll(pageRequest);
		if(pageResult.hasContent())
		{
			return pageResult.getContent();
		}
		else
		{
			return new ArrayList<>();
		}

	}



}
