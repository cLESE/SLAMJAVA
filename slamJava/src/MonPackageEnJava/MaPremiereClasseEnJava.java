package MonPackageEnJava;
import java.util.Scanner;
import java.util.function.*;
public class MaPremiereClasseEnJava {
	
				 public static void main(String[] args){		        
		        int dep = 0;
		        
		        Fonction.Saisie(); //Saisie de l'utilisateur
		        
		        for(int i = 0; i<10; i++){ // si le departement correspond � celui saisie
		            if(Fonction.tarifdep[i][0] == Fonction.dept)
		                dep = i;
		        }

		        System.out.print("\n\nLa tarif de votre d�placement est de : " + String.valueOf(Fonction.CalculTarifDepl(dep)) + "�"); //Affichage du prix + aide de google
		    }
	}
