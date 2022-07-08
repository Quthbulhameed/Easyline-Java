import java.util.*;
public class AdressePostale {
    private String rue;
    private String ville;
    private String codePostal;

    public AdressePostale() {}

    public AdressePostale(String rue, String ville, String codePostal) {
        this.rue=rue;
        this.ville=ville;
        this.codePostal=codePostal;
    } 

public String getRue(){
    return this.rue;
}

public String getVille() {
    return this.ville;
}//getVille

public String getCodePostale() {
    return this.codePostal;
}//getCodePostale


public void setRue(String rue) {   
    this.rue = rue;
}//setRue

public void setVille(String ville) {   
    this.ville = ville;
}//setVille

public void setCodePostal(String codePostal) {   
    this.codePostal = codePostal;
}//setcodePostale

public String toString(){
    return this.rue + " " + this.ville + " " + this.codePostal;
}

//On passe dans le main
 public static void main (String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.print("Veuillez entrer votre numero de rue et votre rue : ");
    String rue=sc.nextLine();

    System.out.print("Veuillez entrer votre Ville: ");
    String ville=sc.nextLine();

    System.out.print("Veuillez entrer votre Code Postal : ");
    String codePostal=sc.nextLine();
    

    AdressePostale monAdressePostale = new AdressePostale(rue,ville,codePostal);

    System.out.println(monAdressePostale);

    AdressePostale AdressePostale2 = new AdressePostale();
    AdressePostale2.setRue("33 rue de l'amour");
    AdressePostale2.setVille("Andresy");
    AdressePostale2.setCodePostal("78570");
    System.out.println(AdressePostale2);
 }//main
}
