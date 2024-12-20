package com.services;
import java.util.ArrayList;
import java.util.List;
import com.entity.Article;


public class ListerArticleParEtatdeDemandeDette implements FiltrerParEtat<Article> {


    @Override
    public List<Article> FilterByState(List<Article> articles, String etat) {
        List<Article> articles2=new ArrayList<>();
        for (Article art : articles) {
            if (art.getDemdet().getEtat().name()==etat) {
                System.out.println("Nous avons trouve les articles pour cet etat de demande de dettes");
                articles2.add(art);
                
            } else {
                return null;
            }
        }

       return articles2;
    }
    
}