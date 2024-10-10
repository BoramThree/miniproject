package com.ohgiraffers.section01.xmlconfig.model.service;

import com.ohgiraffers.section01.xmlconfig.model.dao.EmployeeDAONamKyu;
import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTONamKyu;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xmlconfig.common.Template.getSqlSession;

public class EmployeeServiceNamKyu {

    private EmployeeDAONamKyu employeeDAONamKyu;

    public EmployeeServiceNamKyu() {
        this.employeeDAONamKyu = new EmployeeDAONamKyu();

    }

    public List<EmployeeDTONamKyu> selectAllEmployee() {
        SqlSession sqlSession = getSqlSession();

        List<EmployeeDTONamKyu> employeeList = employeeDAONamKyu.selectAllEmployee(sqlSession);
        return employeeList;
    }
}
