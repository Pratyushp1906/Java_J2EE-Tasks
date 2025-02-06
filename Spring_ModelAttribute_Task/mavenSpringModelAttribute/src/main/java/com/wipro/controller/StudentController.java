package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.model.Student;

@Controller
public class StudentController {

	@RequestMapping(method = RequestMethod.GET, value = "/studentForm")
	public String showForm(Model model) {
	    model.addAttribute("student", new Student());  // Initialize Student object
	    return "studentForm";  // Return the view name (JSP)
	}


	@RequestMapping(method = RequestMethod.POST, value = "/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute("student") Student student) {
	    ModelAndView mv = new ModelAndView();
	    mv.addObject("xyz", student);  // Add student object as 'xyz' to the model
	    mv.setViewName("display");  // View name to display the student details
	    return mv;
	}

}