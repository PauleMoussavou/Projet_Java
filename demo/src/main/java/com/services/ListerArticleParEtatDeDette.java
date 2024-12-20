package com.services;
import java.util.ArrayList;
import java.util.List;

import com.entity.Article;

public class ListerArticleParEtatDeDette implements FiltrerParEtat<Article> {

    @Override
    public List<Article> FilterByState(List<Article> articles, String etat) {
        List<Article> articles2=new ArrayList<>();

        for (Article art : articles) {
            if (art.getDet().getEtat().name()==etat) {
                System.out.println("Les articles concernant cet etat pour une dette ont ete trouve");
                articles2.add(art);
            } else {
                return null;
            }
        }
       return articles2;
    }
    
}
