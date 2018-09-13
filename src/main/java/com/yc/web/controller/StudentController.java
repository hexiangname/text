package com.yc.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	@RequestMapping("loginstu.action")
	public String reg(Student stu,HttpSession session){
		stu=studentBiz.selectStu(stu);
		if(stu!=null&&!"".equals(stu)){
			session.setAttribute("stu", stu);
			return "show";
		}else{
			return "erro";
		}
		
		
	}
}
