package Entities;

public class Article
{
    private String titreArticle;
    private int nbPages;
    private Pigiste lePigiste;

    public Article(String titreArticle, int nbPages, Pigiste lePigiste) {
        this.titreArticle = titreArticle;
        this.nbPages = nbPages;
        this.lePigiste = lePigiste;
    }

    public String getTitreArticle() {
        return titreArticle;
    }

    public int getNbPages() {
        return nbPages;
    }

    public Pigiste getLePigiste() {
        return lePigiste;
    }

    // Cette méthode permet de calculer
    // le montant de l'article : nombre de pages * prix à la page
    public double CalculerMontantArticle()
    {
        // A compléter ici
        double montantAr = 0;

        montantAr = montantAr+getLePigiste().getPrixPage()*getNbPages();

        return montantAr;
      //  return 0;
    }
}
