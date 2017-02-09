package com.tarena.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tarena.dao.EmpDao;
import com.tarena.entity.Emp;
import com.tarena.service.EmpService;

/**
 * 
 * @author wgs
 *请求实例：http://localhost:8099/SpringUnit01/emp/findEmp.do
 */
@Controller
@RequestMapping("/emp")
public class EmpController {
	@Resource
	private EmpService empService;
	@Resource
	private EmpDao empDao;
	
	@RequestMapping("/findEmp")
	public String find(Model model){
		List<Emp> list = empService.findAll();
		model.addAttribute("emps",list);
		return "emp/emp_list";
	}
	
	
	
	
}
