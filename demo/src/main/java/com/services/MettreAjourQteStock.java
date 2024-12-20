package com.services;
import com.entity.Article;
import java.util.List;

public class MettreAjourQteStock {
    
   public Article MettreAjourUnarticle(List<Article> articles , int IdArticle, int NewQte){
    
        for (Article art : articles) {
            if (art.getIdArticle()==IdArticle) {
                System.out.println("Nous avons trouve un id correspondant a l id entre");
                art.setQuantiteDisponible(NewQte);
                return art;
            } else {
                System.out.println("Nous n avons pas trouve d article correspondant a cet Id");
            }
        }
        return null;
    }
}