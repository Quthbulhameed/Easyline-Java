import java.util.*;
public class Voyageur {
    private String nom;
    private int age;
    private String categorie;
    private AdressePostale ladresse;
    private Bagage lebagage;

    public Voyageur() {
    }

    public Voyageur(String nom, int age) {

       this.setNom(nom);
       this.setAge(age);

    }// constructeur

    public String getNom() {
        return this.nom;
    }// getNom

    public int getAge() {
        return this.age;
    }// getAge

    public String getCategorie() {
        return this.categorie;
    }// getAge

    public AdressePostale getAdressePostale() {
        return this.ladresse;
    }

    public Bagage getLebagage() {
        return this.lebagage;
    }

    public void setCategorie() {
        Scanner sc = new Scanner(System.in);
        if (age < 1) {
            this.categorie = ("nourisson");
        } // if
        else if (age <= 18) {
            this.categorie = ("enfant");
        } // else if
        else if (age < 60) {
            this.categorie = ("adulte");
        } // else if
        else {
            this.categorie = ("senior");
        } // else
    }

    public void setNom(String nom) {
        Scanner sc = new Scanner(System.in);
        while (nom.length() < 2) {
            System.out.print("Votre nom doit être composé d'au moins deux caractères, veuillez recommencer :");
            nom = sc.next();
        }
        this.nom = nom;
    }// setNom

    public void setAge(int age) {
        Scanner sc = new Scanner(System.in);
        while (age < 0) {
            System.out.print("Votre âge est négatif, veuillez taper un âge positif : ");
            age = sc.nextInt();
        }
        this.age = age;
        this.setCategorie();
    }// setAge

    public void setAdressePostale(AdressePostale ladresse) {
        this.ladresse = ladresse;
    }
    public void setBagage(Bagage lebagage) {
        this.lebagage = lebagage;
    }

    public String toString(){
        if (ladresse!=null && lebagage!=null){
           return "Identité : " + "Il s'appelle " + this.nom + " - " + "Il a " + this.age + " ans " + " - " + "C'est un  " + this.categorie +  " / " + "Adresse : " + this.ladresse.toString() + " / " + "Valise : " + this.lebagage.toString() ;
        }
        else{
            return "Identité : " + "Il s'appelle " + this.nom + " - " + "Il a " + this.age + " ans " + " - " + "C'est un  " + this.categorie +" / " + "Adresse : " + "Pas d'adresse enregistrée"  + " / " + "Valise : Pas de valises enregistrées " ;
        }  
    }
    // On passe dans le main
    public static void main(String[] args) {

        System.out.print("Veuillez entrer votre nom : ");
        Scanner sc = new Scanner(System.in);
        String nom = sc.next();

        System.out.print("Veuillez entrer votre âge : ");
        int age = sc.nextInt();

        Voyageur monVoyageur = new Voyageur(nom, age);
        
        System.out.println(monVoyageur);

        Voyageur monVoyageur2 = new Voyageur();
        monVoyageur2.setNom("Doukala");
        monVoyageur2.setAge(33);
        
        AdressePostale monAdressePostale = new AdressePostale("rue de la paix","Cergy","78570");
        monVoyageur2.setAdressePostale(monAdressePostale);

        Bagage monBagage = new Bagage("785","violet","62kg");
        monVoyageur2.setBagage(monBagage);
        
        System.out.println(monVoyageur2);


        Bagage monBagage2 = null;
        monVoyageur2.setBagage(monBagage2);

        System.out.println(monVoyageur2);

    }//main 
}//class 
