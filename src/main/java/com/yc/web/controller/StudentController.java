package com.yc.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.bean.Student;
import com.yc.biz.StudentBiz;

@Controller
public class StudentController {
	
	@Resource(name="studentBizImpl")
	private StudentBiz studentBiz;

    /**
     * 登录	
     * @param stu 用户
     * @return
     */
	@RequestMapping(value="loginstu.action",method=RequestMethod.POST)
	public String reg(Student stu,HttpSession session){
		stu=studentBiz.selectStu(stu);
		if(stu!=null&&!"".equals(stu)){
			session.setAttribute("stu", stu);
			return "show";
		}else{
			return "erro";
		}
	}
	
	@RequestMapping(value="/reg.action",method = RequestMethod.POST)
	public @ResponseBody String reg(String name,String pwd){
		Student student = new Student();
		student.setName(name);
		student.setPwd(pwd);
		int result = studentBiz.reg(student);
		return String.valueOf(result);
	}
}
