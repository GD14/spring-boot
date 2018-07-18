package cn.littleisle.singlelogin.orm.service;

import cn.littleisle.singlelogin.orm.model.Post;

import java.util.List;

public interface PostService {

    List<Post> selectAll();

    int  addNewPost(Post post);
}
