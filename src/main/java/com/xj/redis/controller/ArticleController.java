package com.xj.redis.controller;

import com.xj.redis.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping
    public String articleVote(@RequestParam("articleId")Long articleId,@RequestParam("userId")Long userId){
        articleService.articleVote(articleId,userId);
        return "";
    }
}
