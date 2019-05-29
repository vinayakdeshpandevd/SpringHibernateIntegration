package com.vinayak.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vinayak.dao.TTEmployeeDaoImpl;
import com.vinayak.model.TTEmployee;

@Controller
public class TTEmployeeController {
	
	
	@Autowired
	TTEmployeeDaoImpl dao;
	@RequestMapping("/regEmployee")
	public String registerEmployees(Model model)
	{
	
		model.addAttribute("employee", new TTEmployee());
		 System.out.println("controller");
		return "register.jsp";
	
		
	}
	@RequestMapping(value="/regDone", method=RequestMethod.POST)
	public String regDone(@ModelAttribute("employee") TTEmployee empl) {
		
		System.out.println("regDone RequestMapping");
		
		dao.addEmployee(empl);
		 
		return "redirect:/viewEmployees";
	}
	@RequestMapping(value="/viewEmployees", method=RequestMethod.GET)
	public String viewEmployees(Model model)
	{

		//ModelAndView model = new ModelAndView();
		List<TTEmployee> employee = new ArrayList();
		employee=dao.viewEmployee();
		model.addAttribute("list",employee);
		return "viewEmployees.jsp";
	}
	
	  @RequestMapping(value="/updateDelete", method=RequestMethod.GET)
	  public String updateDeleteEmployee(HttpServletRequest req, Model model) {
		  System.out.println("updateOrDelete method in Controller");
		  int primary = Integer.parseInt(req.getParameter("key"));
			
		  String action= req.getParameter("action");
		  System.out.println(" update or Delete::"+action);

		  if(action.equals("update"))
		  {
			  System.out.println("update");
			  		  TTEmployee employee=dao.getObject(primary);  
		  model.addAttribute("employee", employee); 
		  System.out.println("updateEmployee . jsp page");
		  return "updateEmployee.jsp";
		 }
		  else 
		  {
			  System.out.println("Delete");
			  dao.deleteEmployee(primary);
			  return "redirect:/viewEmployees";
		  }
	}
	  
	  @RequestMapping(value="/updateEmployee", method=RequestMethod.POST)
	  public String updateEmployee(@ModelAttribute("employee") TTEmployee employee,HttpServletRequest req) {
		 System.out.println("update final");
		  int primary = Integer.parseInt(req.getParameter("id"));
			employee.setId(primary);

		 dao.updateEmployee(employee);
		return "redirect:/viewEmployees";
		  
	  }
	
	  }	 

