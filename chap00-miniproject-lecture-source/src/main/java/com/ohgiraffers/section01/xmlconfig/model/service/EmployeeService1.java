package com.ohgiraffers.section01.xmlconfig.model.service;

import com.ohgiraffers.section01.xmlconfig.model.dao.EmployeeDAO;
import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xmlconfig.common.Template.getSqlSession;

public class EmployeeService1 {




    private final EmployeeDAO employeeDAO;

    public EmployeeService1(EmployeeDAO employeeDAO) {
        this.employeeDAO = new EmployeeDAO();
    }

    public List<EmployeeDTO> selectAllEmployee() {
        SqlSession sqlSession = getSqlSession();
        List<EmployeeDTO> employeeList = employeeDAO.selectAllEmployee(sqlSession);

        sqlSession.close();

        return employeeList;
    }
}
