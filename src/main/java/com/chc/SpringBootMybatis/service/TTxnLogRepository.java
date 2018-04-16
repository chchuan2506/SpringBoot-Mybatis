package com.chc.SpringBootMybatis.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chc.SpringBootMybatis.entity.TTxnLog;

public interface TTxnLogRepository extends JpaRepository<TTxnLog, Integer>{

}
