package com.ohgiraffers.section01.xmlconfig.model.service;

import com.ohgiraffers.section01.xmlconfig.model.dao.EmployeeMoonDAO;
import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xmlconfig.common.Template.getSqlSession;

public class EmployeeService11 {

    private final EmployeeMoonDAO employeeDAO;

    public EmployeeService11(){
        this.employeeDAO = new EmployeeMoonDAO();
    }

    public List<EmployeeDTO> selectAllEmployee(){
        SqlSession sqlSession = getSqlSession();

        List<EmployeeDTO> employeeList = employeeDAO.selectAllEmployee(sqlSession);

        sqlSession.close();
        return employeeList;
    }
}
