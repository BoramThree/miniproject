package com.ohgiraffers.section01.xmlconfig.model.service;

import com.ohgiraffers.section01.xmlconfig.model.dao.EmployeeDAOYejin;
import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xmlconfig.common.Template.getSqlSession;

public class EmployeeServiceYejin {

    private final EmployeeDAOYejin employeeDAOYejin;

    public  EmployeeServiceYejin(){
        this.employeeDAOYejin = new  EmployeeDAOYejin();
    }

    public List<EmployeeDTO> selectEmployee(int inputYear) {
        SqlSession sqlSession = getSqlSession();

         List<EmployeeDTO> employeeList = employeeDAOYejin.selectEmployeeSalary(sqlSession, inputYear);

         return employeeList;
    }



}
