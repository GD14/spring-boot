package cn.littleisle.singlelogin.business.web;

import cn.littleisle.bean.Response;
import cn.littleisle.bean.ResponseUtil;
import cn.littleisle.singlelogin.orm.model.Article;
import cn.littleisle.singlelogin.orm.model.Content;
import cn.littleisle.singlelogin.orm.model.Directory;
import cn.littleisle.singlelogin.orm.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apis")
public class NotebookController {

    @Autowired
    NoteService noteService;
    @GetMapping("/notebooks")
    public Response getDir(){

        List<Directory> directories =noteService.findAllDirs();
        return ResponseUtil.success(directories);
    }
    @GetMapping("/notebooks/{id}/notes")
    public Response getArticle(@PathVariable int id){

        List<Article> articles=noteService.findArticleByDirId(id);
        return  ResponseUtil.success(articles);
    }

    @RequestMapping("/notes/{id}/content")
    public Response getContent(@PathVariable int id){
        Content content=noteService.findContentByArticleId(id);
        return ResponseUtil.success(content);
    }
}
