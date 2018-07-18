package cn.littleisle.singlelogin.orm.service.impl;

import cn.littleisle.singlelogin.orm.dao.PostMapper;
import cn.littleisle.singlelogin.orm.model.Post;
import cn.littleisle.singlelogin.orm.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostMapper postMaper;
    @Override
    public List<Post> selectAll() {
        List<Post> posts=postMaper.selectAll();

        return posts;
    }

    @Override
    public int addNewPost(Post post) {
        int res=postMaper.insert(post);

        return res;
    }
}
