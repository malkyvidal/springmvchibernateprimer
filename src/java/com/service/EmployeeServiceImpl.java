/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;
import com.dao.EmployeeDao;
import com.model.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author malky
 */

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> listEmployee() {
        return  employeeDao.listEmployee();//To change body of generated methods, choose Tools | Templates.
    }
    
}
