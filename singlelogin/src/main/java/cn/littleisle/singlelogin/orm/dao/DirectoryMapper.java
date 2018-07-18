package cn.littleisle.singlelogin.orm.dao;

import cn.littleisle.singlelogin.orm.model.Directory;

import java.util.List;

public interface DirectoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Directory record);

    int insertSelective(Directory record);

    Directory selectByPrimaryKey(Integer id);

    List<Directory> selectAll();

    int updateByPrimaryKeySelective(Directory record);

    int updateByPrimaryKey(Directory record);
}