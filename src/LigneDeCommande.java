public class LigneDeCommande {
private long id ;
private int qte ;
private double sousTotal ;
private Facture facture;
private Produit produit ;

    public LigneDeCommande(Long id, Integer qte, Double sousTotal, Facture facture, Produit produit) {
        this.id = id;
        this.qte = qte;
        this.sousTotal = sousTotal;
        this.facture = facture;
        this.produit = produit;
    }

//getter

    public long getId() {
        return id;
    }

    public int getQte() {
        return qte;
    }

    public double getSousTotal() {
        return sousTotal;
    }

    public Facture getFacture() {
        return facture;
    }

    public Produit getProduit() {
        return produit;
    }


// setters


    public void setId(long id) {
        this.id = id;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public void setSousTotal(double sousTotal) {
        this.sousTotal = sousTotal;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}
