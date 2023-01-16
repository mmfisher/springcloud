package com.aiden.springcloud.dao;

import com.aiden.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author : Aiden
 * @Date: 2023-1-13 20:42
 */
@Mapper
public interface DeptDao {

    /**
     * 添加部门
     *
     * @param dept
     * @return
     */
    @Insert("INSERT INTO DEPT (DNAME, DB_SOURCE) VALUES (#{dname},DATABASE());")
    boolean addDept(Dept dept);

    /**
     * 根据部门查询
     *
     * @param deptno
     * @return
     */
    @Select("SELECT * FROM DEPT WHERE DEPTNO = #{deptno}")
    Dept queryById(Long deptno);

    /**
     * 查询所有部门
     *
     * @return
     */
    @Select("SELECT * FROM DEPT")
    List<Dept> queryAll();
}
