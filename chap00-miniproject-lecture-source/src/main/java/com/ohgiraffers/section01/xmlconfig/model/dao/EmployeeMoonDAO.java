package com.ohgiraffers.section01.xmlconfig.model.dao;

import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTOmoon;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmployeeMoonDAO {

    public List<EmployeeDTOmoon> selectAllEmployee(SqlSession sqlSession) {

        return sqlSession.selectList("EmployeeMapper.selectAllEmployee");

    }

}
