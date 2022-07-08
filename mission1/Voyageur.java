import java.util.*;
public class Voyageur {
    private String nom;
    private int age;
    private String categorie;

    public Voyageur() {}

    public Voyageur(String nom, int age) {
 

    Scanner sc=new Scanner(System.in);
        while(nom.length() < 2) {
            System.out.print("Votre nom doit être composé d'au moins deux caractères, veuillez recommencer :");
            nom = sc.next();
            
        }
        this.nom=nom;
        while (age < 0) {
            System.out.print("Veuillez taper un âge positif : ");
            age=sc.nextInt();
           
        }
        this.age=age;
        this.setCategorie();


    }//constructeur

    public void afficher(){
        System.out.println("Il s'appelle " + this.nom +" / " + "Il a " + this.age + " ans " + " / " + "c'est un  " + this.categorie);
    }//afficher 

    public String getNom() {
        return this.nom;
    }//getNom

    public int getAge() {
        return this.age;
    }//getAge

    public String getCategorie() {
        return this.categorie;
    }//getAge
         
    public void setCategorie(){
        Scanner sc=new Scanner(System.in);
        if (age < 1) {
            this.categorie=("nourisson");
        }//if
        else if ( age <= 18) {
            this.categorie=("enfant");
        }//else if 
        else if (age < 60) {
            this.categorie=("adulte");
        }//else if 
        else{
            this.categorie=("senior");
        }//else
    }


    public void setNom(String nom) {
        Scanner sc=new Scanner(System.in);
        while(nom.length() < 2) {
            System.out.print("Votre nom doit être composé d'au moins deux caractères, veuillez recommencer :");
            nom = sc.next();
        }//while
        this.nom = nom;
    }//setNom

    public void setAge(int age) {
        Scanner sc=new Scanner(System.in);
        while (age < 0) {
            System.out.print("Votre âge est négatif, veuillez taper un âge positif : ");
            age=sc.nextInt();
        }
        this.age = age;
        setCategorie();
        
    }//setAge 


    //On passe dans le main
    public static void main (String[] args){
       
        System.out.print("Veuillez entrer votre nom : ");
        Scanner sc=new Scanner(System.in);
        String nom=sc.next();

        System.out.print("Veuillez entrer votre âge : ");
        int age=sc.nextInt();
        
        Voyageur monVoyageur = new Voyageur(nom,age);
        
        monVoyageur.afficher();

        Voyageur monVoyageur2 = new Voyageur();
        monVoyageur2.setNom("doukala");
        monVoyageur2.setAge(33);
        monVoyageur2.afficher();
       
    }//main 
}//class 

