package cn.littleisle.singlelogin.orm.service;

import cn.littleisle.singlelogin.orm.model.Article;
import cn.littleisle.singlelogin.orm.model.Content;
import cn.littleisle.singlelogin.orm.model.Directory;

import java.util.List;

public interface NoteService {

    List<Article> findArticleByDirId(int dirId);
    List<Directory> findAllDirs();
    Content findContentByArticleId(int articleId);
}
