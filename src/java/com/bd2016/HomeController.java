/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd2016;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import com.service.EmployeeService;
/**
 *
 * @author malky
 */
@Controller
public class HomeController {

    
    @Autowired
    private EmployeeService employeeService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        
        return "index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("saludo", "hola mvc");
        
        model.addAttribute("cantidadEmpleados", employeeService.listEmployee().size()) ;
        return "home";
    }
}
