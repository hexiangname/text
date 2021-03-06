
package com.yc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;



@Repository
public interface BaseDao<T> {
	
	public List<T> findAll(T t,String sqlId);
	
	public List<T> findAll(T t,Map map,String sqlId);
	
	public List<T> findAll(T t,Object obj,String sqlId);
	
	public T find(T t,Object obj,String sqlId);
	
	public Integer add(T t,String sqlId);
	
	public Integer add(T t,Map map,String sqlId);
	
	public Integer addMany(T t,List list,String sqlId);
	
	public Integer delete(T t,String sqlId);
	
	public Integer delete(T t,Map map,String sqlId);
	
	public Integer deleteMany(T t,List list,String sqlId);
	
	public Integer update(T t,String sqlId);
	
	public Integer update(T t,Map map,String sqlId);
	
	public Integer updateMany(T t,List list,String sqlId);

	/**
	 * 聚合
	 * @param t
	 * @param sqlId
	 * @return
	 */
	public double findFunc(T t,String sqlId);

	public double findFunc(T t,Map map,String sqlId);

	public T find(T t,Map map,String sqlId);
	
	public Integer update(T t,Object obj,String sqlId);
}

