package com.ohgiraffers.section01.xmlconfig.model.dao;

import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmployeeDAOYejin {

    public List<EmployeeDTO> selectEmployeeSalary(SqlSession sqlSession, int inputYear) {
        return sqlSession.selectList("EmployeeMapperYejin.selectEmployeeSalary", inputYear);
    }

}
