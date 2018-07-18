package cn.littleisle.singlelogin.business.web;

import cn.littleisle.bean.Response;
import cn.littleisle.bean.ResponseUtil;
import cn.littleisle.singlelogin.orm.model.Post;
import cn.littleisle.singlelogin.orm.service.PostService;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
public class PostController {

    private Logger logger=LogManager.getLogger(PostController.class);
    @Autowired
    PostService postService;

    @RequestMapping(value="/add",method = RequestMethod.POST)
    public Response add(Post post){
        postService.addNewPost(post);
        return new Response().ok();
    }

    @RequestMapping(value = "/list")
    public Response list(@RequestParam(value = "uid",defaultValue = "0") Integer uid){
        logger.trace(uid+"\n");
        System.out.println(uid+"\n");
        List<Post> data=postService.selectAll();
        return ResponseUtil.success(data);
    }
}
