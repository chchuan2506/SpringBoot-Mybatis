package com.chc.SpringBootMybatis.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chc.SpringBootMybatis.entity.Person;
import com.chc.SpringBootMybatis.entity.TTxnLog;
import com.chc.SpringBootMybatis.service.TTxnLogRepository;

@RestController
@RequestMapping("/TTxnLog")
public class TTxnLogController {
	@Autowired
	TTxnLogRepository txnLogRepository;

	@RequestMapping("/save")
	public TTxnLog save() {
		List<TTxnLog> l = new ArrayList();
		TTxnLog txnLog = new TTxnLog();
		txnLog.setC_DATE("2000");
		txnLog.setC_TIME("0200");
		txnLog.setC_TERMCODE("100");
		txnLog.setC_TRACENO("20");
		txnLog.setC_TRANSDATETIME("20200000");
		txnLog.setC_ACQCRYCODE("100");
		txnLog.setI_FEELSN(12);
		// txnLog = txnLogRepository.save(txnLog);
		l = txnLogRepository.save(l);
		return txnLog;
	}

	@RequestMapping("/saveList")
	public List<TTxnLog> saveList() {
		List<TTxnLog> l = new ArrayList();
		for (int i = 0; i < 2; i++) {
			TTxnLog txnLog = new TTxnLog();
			txnLog.setC_DATE("2000");
			txnLog.setC_TIME("0200");
			txnLog.setC_TERMCODE("100");
			txnLog.setC_TRACENO("20");
			txnLog.setC_TRANSDATETIME("20200000");
			txnLog.setC_ACQCRYCODE("100");
			txnLog.setI_FEELSN(i);
		}
		l = txnLogRepository.save(l);
		return l;
	}

	@RequestMapping("/all")
	public List<TTxnLog> all() {
		return txnLogRepository.findAll();
	}
}
