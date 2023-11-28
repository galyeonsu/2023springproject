package com.study.springboot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.dao.ISimpleBbsDao;
import com.study.springboot.dto.SimpleBbsDto;

@Service
public class SimplebbsService implements ISimpleBbsService {

	@Autowired
	ISimpleBbsDao dao;

	@Override
	public List<SimpleBbsDto> list() {
		return dao.listDao();
	}

	@Override
	public int count() {
		int nResult = dao.countDao();
		return nResult;
	}

	@Override
	public SimpleBbsDto view(String id) {
		return dao.viewDao(id);
	}

	@Override
	public int write(Map<String, String> map) {
		int nRusult = dao.writeDao(map);
		return nRusult;
	}

	@Override
	public int delete(String id) {
		int nRsult = dao.deleteDao(id);
		return nRsult;
	}

}
