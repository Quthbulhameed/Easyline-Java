import java.util.*;

public class AgenceVoyage {
    private String nom;
    private AdressePostale adresse;
    private ArrayList voyageur;

    public AgenceVoyage() {
    }

    public AgenceVoyage(String nom, AdressePostale adresse) {
        this.setNom(nom);
        this.setAdresse(adresse);
        this.setVoyageur(voyageur);
    }// constructeur

    public String getNom() {
        return nom;
    }//getNom

    public AdressePostale getAdresse() {
        return adresse;
    }//getAdresse

    public ArrayList getVoyageur() {
        return voyageur;
    }//getVoyageur

    public void setNom(String nom) {
        this.nom = nom;
    }//setNom

    public void setAdresse(AdressePostale adresse) {
        this.adresse = adresse;
    }//setAdresse

    public void setVoyageur(ArrayList voyageur) {
        this.voyageur = voyageur;
    }//setVoyageur

    public String toString() {
        return ("Le nom de l'agence : ") + this.nom + " | " + ("L'adresse de l'agence : ") + this.adresse;
    }//toString

    public static void main(String[] args) {

        System.out.print("Veuillez entrer le nom de l'agence : ");
        Scanner sc = new Scanner(System.in);
        String nom = sc.nextLine();

        System.out.print("Veuillez entrer le numéro et la rue de l'agence : ");
        String rue = sc.nextLine();

        System.out.print("Veuillez entrer la ville de l'agence : ");
        String ville = sc.nextLine();

        System.out.print("Veuillez entrer le code postal de l'agence : ");
        String codePostal = sc.nextLine();

        AdressePostale monAdresse = new AdressePostale(rue, ville, codePostal);

        AgenceVoyage monAgence = new AgenceVoyage(nom, monAdresse);
        System.out.println(monAgence);


        ArrayList<String> mesVoyageurs = new ArrayList<>();
        mesVoyageurs.add("Chaima");
        mesVoyageurs.add("Samy");
        mesVoyageurs.add("Kenza");
        mesVoyageurs.add("Amin");
        mesVoyageurs.add("Djibril");

        for (int i = 0; i < 1; i++) {
            System.out.println("Voici la liste de voyageurs actuelle : " + mesVoyageurs);
        }//for

        System.out.println("Voici la liste de plusieurs fonctionnalités : \n");
        System.out.println("1 : Ajout d'un nouveau voyageur");
        System.out.println("2 : Recherche d'un utilisateur par son nom");
        System.out.println("3 : Suppression d'un utilisateur par son nom");
        System.out.println("4 : Affichage des informations de l’agence de voyage (nom, adresse et liste des voyageurs)");
        System.out.println("5 : Quitter l'application");
        System.out.println("Veuillez choisir une des fonctionnalités en rentrant 1, 2, 3, 4 ou 5 : ");

        int choix = sc.nextInt();

        if (choix == 1) {
            System.out.print("Ajout d'un nouveau voyageur\n");
            System.out.println("Veuillez saisir le nom de votre voyageur : ");
            System.out.println("Veuillez saisir l'âge de votre voyageur : ");
            String voyageur = sc.next();
            mesVoyageurs.add(voyageur);
            System.out.println("Voyageur ajouté avec succès, voici la liste acutelle :\n" + mesVoyageurs);
        }

        if (choix == 2) {
            System.out.print("Rechercher un utilisateur par son nom\n");
            System.out.println("Veuillez entrer le nom du voyageur recherché : ");
            String voyageur2 = sc.next();
            if (mesVoyageurs.contains(voyageur2)) {
                System.out.println("Votre voyageur est bien dans la liste, voici la liste : " + mesVoyageurs);
            } else {
                System.out.print("Pas dans la liste, désolé.");
            }
        }

        if (choix == 3) {
            System.out.print("Supprimer un utilisateur par son nom\n");
            System.out.println("Veuillez entrer le nom du voyageur que vous souhaitez supprimer : ");
            String voyageur3 = sc.next();
            for (int i = 0; i < 1; i++) {
                if (voyageur3.equals(mesVoyageurs.get(i))) {
                    System.out.println("Vous avez choisi le voyageur : " + voyageur3);
                    mesVoyageurs.remove(i);
                    System.out.println("Voici la liste actuelle : " + mesVoyageurs);
                } else {
                    System.out.print("Pas dans la liste, désolé.");
                }
            }
        }

        if (choix == 4) {
            System.out.print("Affichage des informations de l’agence de voyage (nom, adresse et liste des voyageurs)\n");
            System.out.println(monAgence);
            System.out.print("Voici la liste de voyageurs actuelle : " + mesVoyageurs);
        }

        if (choix == 5) {
            System.out.print("Vous avez quitté l'application avec succès");
        }

    }//main
}//class
