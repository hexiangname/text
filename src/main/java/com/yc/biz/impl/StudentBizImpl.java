package com.yc.biz.impl;

import java.util.List;

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

	/**
	 * 登录
	 */
	@Override
	public Student selectStu(Student st) {
		List<Student> list=this.baseDao.findAll(st, "selectStu");
		if(list!=null&&list.size()<0){
			return list.get(0);
		}else{
			return null;
		}
		
	}

}
