package com.ohgiraffers.section01.xmlconfig.model.dao;

import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTONamKyu;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmployeeDAONamKyu {


    public List<EmployeeDTONamKyu> selectAllEmployee(SqlSession sqlSession) {
        return sqlSession.selectList("employeeMapper.")

    }
}
