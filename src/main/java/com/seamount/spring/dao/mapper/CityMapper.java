package com.seamount.spring.dao.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.seamount.spring.dao.model.CityModel;

@Repository
@MapperScan("com.seamount.spring.dao.mapper")
public interface CityMapper {
	
	String columns ="id,name,pid,first_letter,pinyin";
	
	String insert = "id,name,pid,first_letter,pinyin";
	
	String insertProperty = "#{id},#{name},#{pid},#{firstLetter},#{pinyin}";
	
	String update = "id=#{id},name=#{name},pid=#{pid},first_letter=#{first_letter},pinyin=#{pinyin}";
	
	@Insert("insert into city("+insert+") values ("+insertProperty+")")
	public long insert(CityModel CityModel);
	
	@Select("select "+columns+" from city where 1=1 and id= #{id}")
	@ResultMap(value="com.seamount.spring.dao.mapper.CityMapper.CityModelMap")
	public CityModel queryById(long id);
	
	@Update("update city set "+update+" where 1=1 and id = #{id}")
	public long update(CityModel CityModel);
	
	@Delete("delete from city where 1=1 and id = #{id}")
	public long delete(long id);
	
	@InsertProvider(type=com.seamount.spring.dao.provider.CityProvider.class,method="batchInsert")
	long batchInsert(Map<String, List<CityModel>> map);
	
	@InsertProvider(type=com.seamount.spring.dao.provider.CityProvider.class,method="batchDelete")
	long batchDelete(String ids);
	

	
	

}
