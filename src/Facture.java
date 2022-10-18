
import java.util.Date;
import java.util.List;
public class Facture {
  private String numero;
  private Date date;
  private double total;
   List<LigneDeCommande> lignesDeCommande ;
private Client client;

   // constructor


    public Facture(String numero, Date date, Client client) {
        this.numero = numero;
        this.date = date;
        this.client = client;
    }

    // getters
    public String getNumero() {
        return numero;
    }

    public Date getDate() {
        return date;
    }

    public double getTotal() {
        return total;
    }

    public Client getClient() {
        return client;
    }

    public List<LigneDeCommande> getLignesDeCommande() {
        return lignesDeCommande;
    }

    // setters


    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setLignesDeCommande(List<LigneDeCommande> lignesDeCommande) {
        this.lignesDeCommande = lignesDeCommande;
    }
}
