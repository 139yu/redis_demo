package com.xj.redis.service.impl;

import com.xj.redis.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class ArticleServiceImpl implements ArticleService {


    @Override
    public int articleVote(Long articleId, Long userId) {
        return 0;
    }
}
