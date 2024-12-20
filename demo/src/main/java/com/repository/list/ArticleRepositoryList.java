package com.repository.list;

import java.util.List;

import com.entity.Article;

public interface ArticleRepositoryList extends RepositoryEntity<Article> {

    @Override
    default void create(Article art) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    default List<Article> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    
}
