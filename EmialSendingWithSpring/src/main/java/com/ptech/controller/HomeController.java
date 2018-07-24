package com.ptech.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ptech.dao.genericDao;
import com.ptech.pojo.StudentMaster;
import com.ptech.service.GenericServiceDao;
import com.ptech.service.MyServiceDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private MyServiceDao loadservice;
	
	@Autowired
	private GenericServiceDao<StudentMaster> genobj;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		List<StudentMaster> studentlist=loadservice.getStudentDetails();
		    
	    model.addAttribute("stlist", studentlist);
			
		return "home";
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST,params={"name","address"})
	public String save(Model model,HttpServletRequest request,@RequestParam("name") String name,@RequestParam("address")
	String address)
	{
	
    System.out.println("name found "+name);	
    System.out.println("address found "+address);
		
    
    StudentMaster stdententity=new StudentMaster("",name,address);
   
    boolean save=genobj.save(stdententity);
    
    if(save)
    {
    	logger.info("Save successfully");
    	
    }
    
    List<StudentMaster> studentlist=loadservice.getStudentDetails();
    
    model.addAttribute("stlist", studentlist);
	
	return "savePage";
		
	}
	
	
	@RequestMapping(value="/studentinfo",params={"stid","stname"})
	public String retriveinfo(Model model,@RequestParam("stid") String stid,@RequestParam("stname") String stname)
	{
		
		System.out.println("stid and stname found "+stid+"  "+stname);
	model.addAttribute("stid", stid)	;
	model.addAttribute("stname",stname);
		
	return "studentinfo";
	}
	

}
