package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BugDetail;

@Repository
public interface BugRepository extends JpaRepository<BugDetail, Integer>{

}
