/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.studentmvc.controller;

import java.util.List;
import org.afdemp.studentmvc.entities.Student;
import org.afdemp.studentmvc.service.StudentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author petros_trak
 */
@Controller
@RequestMapping("/")
public class StudentController {
    
    @Autowired
    StudentImpl studentService;
    
    @Autowired
    MessageSource messageSourse;
    
    @RequestMapping("/")
    public String listAllStudents(ModelMap view){
        List<Student> students = studentService.findAllStudents();
        view.addAttribute("students", students);
        return("studentlist"); 
    }
}
