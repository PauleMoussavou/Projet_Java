package com.services;

import com.repository.list.RepositoryEntity;

import java.util.ArrayList;
import java.util.List;

import com.entity.Article;

public class ListerArticleServices implements RepositoryEntity<Article>{

    List<Article> articles = new ArrayList<>();

    @Override
    public void create(Article art) {
        articles.add(art);
        System.out.println("L article a ete ajoute:"+art);
        
    }

    @Override
    public List<Article> findAll() {

        return articles;
    }
    
}
