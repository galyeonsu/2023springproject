package com.studyspringboot.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ITransaction1Dao {
	public void pay(String consumaerID, int amount);
}
