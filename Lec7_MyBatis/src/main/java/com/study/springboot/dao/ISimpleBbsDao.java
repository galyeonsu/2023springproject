package com.study.springboot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.study.springboot.dto.SimpleBbsDto;
@Mapper
public interface ISimpleBbsDao {
	public List<SimpleBbsDto> listDao();
//	public Integer countDao();
	public int countDao();
	public SimpleBbsDto viewDao(String id);
//	public int writeDao(String writer, String tilte, String content);
	public int writeDao(Map<String, String> map);
	public int deleteDao(@Param("_id") String id);
}