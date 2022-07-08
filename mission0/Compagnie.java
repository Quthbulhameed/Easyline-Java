public class Compagnie {
    
    public String nomCompagnie;
    public int codeCompagnie;
    public double ca;
    public String couleurPrincipaleLogo;
    public String couleurSecondaireLogo;
 
    public Compagnie(){
    }

    public Compagnie(String nomCompa){
        this.nomCompagnie=nomCompa;
    }

    
    public Compagnie(String nomCompa,String couleurPrincipale,String couleurSecondaire){
        this.nomCompagnie=nomCompa;
        this.couleurPrincipaleLogo=couleurPrincipale;
        this.couleurSecondaireLogo=couleurSecondaire;
    }

    public Compagnie(String nomCompa,String couleurPrincipale,String couleurSecondaire,int codeComp){
        this.nomCompagnie=nomCompa;
        this.couleurPrincipaleLogo=couleurPrincipale;
        this.couleurSecondaireLogo=couleurSecondaire;
        this.codeCompagnie=codeComp;
    }

    public void afficher(){
        if(couleurSecondaireLogo==null){
        System.out.println(this.nomCompagnie + " / " + this.codeCompagnie+ " / "+ "Couleur principale : "+this.couleurPrincipaleLogo);
        }
        else if(codeCompagnie==0){
        System.out.println(this.nomCompagnie + " / " +"Couleur principale : "+this.couleurPrincipaleLogo+" / " +"Couleur secondaire : "+this.couleurSecondaireLogo);
        }
        
        else{
        System.out.println(this.nomCompagnie + " / " + this.codeCompagnie+ " / "+"Couleur principale : "+this.couleurPrincipaleLogo+" / " +"Couleur secondaire : "+this.couleurSecondaireLogo);
        }
    }
    public static void main(String args[]){
        Compagnie maCompagnie1= new Compagnie();
        maCompagnie1.nomCompagnie="zaza";
        maCompagnie1.codeCompagnie=1;
        maCompagnie1.couleurPrincipaleLogo="Orange";
        maCompagnie1.couleurSecondaireLogo="Beige";
        maCompagnie1.afficher();

        Compagnie maCompagnie2= new Compagnie("zozo");
        maCompagnie2.codeCompagnie=2;
        maCompagnie2.couleurPrincipaleLogo="Rouge";
        maCompagnie2.afficher();

        Compagnie maCompagnie3=new Compagnie("easyJune");
        maCompagnie3.codeCompagnie=3;
        maCompagnie3.couleurPrincipaleLogo="Vert";
        maCompagnie3.afficher();

        Compagnie maCompagnie4=new Compagnie("Inventée");
        maCompagnie4.codeCompagnie=4;
        maCompagnie4.couleurPrincipaleLogo="Violet";
        maCompagnie4.afficher();

        Compagnie maCompagnie5=new Compagnie();
        maCompagnie5.nomCompagnie="Inventée2";
        maCompagnie5.codeCompagnie=5;
        maCompagnie5.couleurPrincipaleLogo="Gris";
        maCompagnie5.afficher();

        Compagnie maCompagnie6=new Compagnie();
        maCompagnie6.nomCompagnie="Inventée3";
        maCompagnie6.couleurPrincipaleLogo="Kaki";
        maCompagnie6.couleurSecondaireLogo="Magenta";
        maCompagnie6.afficher();

        Compagnie maCompagnie7=new Compagnie();
        maCompagnie7.nomCompagnie="Inventée4";
        maCompagnie7.couleurPrincipaleLogo="Marron";
        maCompagnie7.couleurSecondaireLogo="Pourpre";
        maCompagnie7.codeCompagnie=7;
        maCompagnie7.afficher();
   }
}
