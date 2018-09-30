package com.example.demo.controller;


import com.example.demo.bean.Employee;
import com.example.demo.bean.department;

import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class deptController {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private EmployeeMapper  employeeMapper;

    @ResponseBody
    @GetMapping("/dept")
    public department getDeptById(){
        return departmentMapper.getDeptById();
    }

    @GetMapping("/dept2")
    public String insertDept(department dept){
         departmentMapper.insertDept(dept);
        return "redirect:/dept";
    }
    @ResponseBody
    @RequestMapping("/depts")
    public String login(){
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/emp")
    public Employee emp(){
        return employeeMapper.getempById();
    }
}
