package cn.littleisle.singlelogin.orm.dao;

import cn.littleisle.singlelogin.orm.model.Article;

import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    List<Article> selectByDirId(Integer dirId);
    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
}