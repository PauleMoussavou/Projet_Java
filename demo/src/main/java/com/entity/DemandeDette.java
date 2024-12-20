ackage com.entity;

import java.util.List;

public class DemandeDette {
    private int idDemandeDette;
    private Client clt;
    private EnumDemandeDette etat;
    private List<Article> articles;

    public Client getClt() {
        return clt;
    }
    public void setClt(Client clt) {
        this.clt = clt;
    }
    public EnumDemandeDette getEtat() {
        return etat;
    }
    public void setEtat(EnumDemandeDette etat) {
        this.etat = etat;
    }

    public int getIdDemandeDette() {
        return idDemandeDette;
    }
    public void setIdDemandeDette(int idDemandeDette) {
        this.idDemandeDette = idDemandeDette;
    }
    
    
    public List<Article> getArticles() {
        return articles;
    }
    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
    @Override
    public String toString() {
        return "DemandeDette [etat=" + etat + ", articles=" + articles + "]";
    }
    
    
    

}
