package com.example.demo.mapper;

import com.example.demo.bean.department;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface DepartmentMapper {

    @Select("select * from department")
    public department getDeptById();

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(department dept);
}
