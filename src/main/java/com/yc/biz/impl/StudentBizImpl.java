package com.yc.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.bean.Student;
import com.yc.biz.StudentBiz;
import com.yc.dao.BaseDao;

/**
 * 学生功能实现类
 * @author Administrator
 *
 */
@Service
public class StudentBizImpl implements StudentBiz{

	private BaseDao<Student> baseDao;
	
	@Resource(name = "baseDaoImpl")
	public void setBaseDao(BaseDao<Student> baseDao){
		this.baseDao=baseDao;
	}
	
	/**
	 * 注册
	 */
	@Override
	public int reg(Student st) {
		int i = this.baseDao.add(st, "reg");
		return i;
	}

}
