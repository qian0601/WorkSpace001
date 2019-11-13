package com.jk.service.impl;

import com.jk.model.DiscussModel;
import com.jk.service.DisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class DisServiceImpl implements DisService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public String addis(DiscussModel discuss) {
        discuss.setCid(1);
        mongoTemplate.save(discuss);
        return "评论成功";
    }
}
