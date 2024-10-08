package com.ohgiraffers.section01.xmlconfig.model.dao;

import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmployeeDAO {

    public List<EmployeeDTO> selectAllEmployee(SqlSession sqlSession) {

    return sqlSession.selectList("EmployeeMapper.selectAllEmployee");

    }
}
