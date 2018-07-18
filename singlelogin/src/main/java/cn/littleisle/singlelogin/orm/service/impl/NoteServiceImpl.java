package cn.littleisle.singlelogin.orm.service.impl;

import cn.littleisle.singlelogin.orm.dao.ArticleMapper;
import cn.littleisle.singlelogin.orm.dao.ContentMapper;
import cn.littleisle.singlelogin.orm.dao.DirectoryMapper;
import cn.littleisle.singlelogin.orm.model.Article;
import cn.littleisle.singlelogin.orm.model.Content;
import cn.littleisle.singlelogin.orm.model.Directory;
import cn.littleisle.singlelogin.orm.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    DirectoryMapper directoryMapper;
    @Autowired
    ContentMapper contentMapper;

    @Override
    public Content findContentByArticleId(int articleId) {

        return contentMapper.selectByArticleId(articleId);
    }
    @Override
    public List<Article> findArticleByDirId(int dirId) {

        return articleMapper.selectByDirId(dirId);
    }

    @Override
    public List<Directory> findAllDirs() {

        return directoryMapper.selectAll();
    }
}
