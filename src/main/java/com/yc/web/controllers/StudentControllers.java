package com.yc.web.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.bean.Student;
import com.yc.biz.StudentBiz;

/**
 * 学生控制层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("back/student")
public class StudentControllers {
	@Resource(name="studentBizImpl")
	private StudentBiz studentBiz;
	
	@RequestMapping(value="/reg.action",method = RequestMethod.POST)
	public @ResponseBody String reg(String name,String pwd){
		Student student = new Student();
		student.setName(name);
		student.setPwd(pwd);
		int result = studentBiz.reg(student);
		return String.valueOf(result);
	}
}
