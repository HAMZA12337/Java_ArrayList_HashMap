
import java.util.ArrayList;
import java.util.Date;
import java.util.*;

public class Main {
    // get client
    public static Client getClient(Long idClient) {
        return new Client(Long.valueOf(1), "Ali ","Moufid");
    }

// get Factures
public static List<Facture> getFactures(Client client) {
// creer les produits
    Produit produit1 = new Produit(Long.valueOf(1), "Iphone X", Double.valueOf(14000.00));
    Produit produit2 = new Produit(Long.valueOf(1), "Airpods 2", Double.valueOf(3000.00));
// creer les factures
    Facture facture1 = new Facture("1/A", new Date(2020, 1, 1), client);
    Facture facture2 = new Facture("2/A", new Date(2020, 1, 1), client);
    // creer les lignes de commandes
    LigneDeCommande ligne1_1 = new LigneDeCommande(Long.valueOf(1), Integer.valueOf(2), Double.valueOf(28000.00), facture1, produit1);
    LigneDeCommande ligne1_2 = new LigneDeCommande(Long.valueOf(1), Integer.valueOf(3), Double.valueOf(18000.00), facture1, produit2);

// on a creer une liste de commande
    List<LigneDeCommande> lignesDeCommande1 = new ArrayList<>();

    lignesDeCommande1.add(ligne1_1);
    lignesDeCommande1.add(ligne1_2);
    facture1.setLignesDeCommande(lignesDeCommande1);



    LigneDeCommande ligne21 = new LigneDeCommande(Long.valueOf(1), Integer.valueOf(1), Double.valueOf(14000.00), facture1, produit1);
    LigneDeCommande ligne22 = new LigneDeCommande(Long.valueOf(1), Integer.valueOf(1), Double.valueOf(3000.00), facture1, produit2);

   //------------------------------------------------------------- second part --------------------------------------------------------------------
    List<LigneDeCommande> lignesDeCommande2 = new ArrayList<>();
    lignesDeCommande2.add(ligne21);
    lignesDeCommande2.add(ligne22);
    facture2.setLignesDeCommande(lignesDeCommande2);

// la liste des facture
    List<Facture> facturesClient = new ArrayList<>();
    facturesClient.add(facture1);
    facturesClient.add(facture2);

    client.setFacture(facturesClient);


    // public LigneDeCommande(Long id, Integer qte, Long souTotal, Facture facture, Produit produit) {

    return facturesClient;
}






    public static void main(String[] args) {

        Client client = getClient(Long.valueOf(1));
        System.out.println("Factures du client ayant numéro " + client.getId() + " " + client.getNom());
        System.out.println("");
        System.out.println("");
        List<Facture> facturesClient = getFactures(client);
//        for (Facture facture : facturesClient) {
//            System.out.println("Numéro " + facture.getNumero());
//            System.out.println("Date " + facture.getDate());
//            System.out.println("------------------------------------------------");
//            System.out.println("    Qte     |   Sous Total  |       Article     ");
//            System.out.println("------------------------------------------------");
//
//            for (LigneDeCommande ligneDeCommande : facture.getLignesDeCommande()) {
//                System.out.println("      " + ligneDeCommande.getQte() +"    |    " + ligneDeCommande.getSousTotal() +"     |       "+ ligneDeCommande.getProduit().getDesignation());
//            }
//            System.out.println("------------------------------------------------");
//            System.out.println("");
//            System.out.println("");
//        }
        HashMap<String, Integer> getQte = new HashMap<>();
        for (Facture facture : facturesClient) {

            for (LigneDeCommande ligneDeCommande : facture.getLignesDeCommande()) {
//                System.out.println(facture.getClient().getNom()+"  "+facture.getClient().getPrenom() +"-----------" +
//                        ligneDeCommande.getProduit().getDesignation()+"----->"+ligneDeCommande.getQte()+"------->"+ligneDeCommande.getSousTotal());

                getQte.put(ligneDeCommande.getProduit().getDesignation(),ligneDeCommande.getQte());



            }
            System.out.println(getQte );

        }
        System.out.println("--------------------");
        for (String key : getQte.keySet()) {
            System.out.println(key+"    "+getQte.get(key));
        }



    }
}