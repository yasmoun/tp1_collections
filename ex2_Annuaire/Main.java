import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Annuaire annuaire=new Annuaire();
		Scanner sc =new Scanner(System.in);
		boolean test=true;
		while(test) {
		System.out.print("choisir entre ces caractères  '+nom' (ajout) / '?nom' (recherche) / '!' (afficher tous) / '.' (arrret) : ");		
		String c= sc.nextLine();
		String n =c.substring(1);
		
		if(c.startsWith("+")) {
			System.out.print("entrer ton numéro "+n+": ");
			int num=sc.nextInt();
			System.out.print("entrer ton adresse: ");
			sc.nextLine();
			String adr=sc.nextLine();
			annuaire.ajoutFiche(n, num, adr);
		}
		else if(c.startsWith("?")) {
			Fiche p = annuaire.rechercheFiche(n);
			if(p!= null) {
				System.out.println(p);
			}
			else {
				System.out.println("Aucune personne trouvée avec ce nom !");
			}
		}
		else if(c.startsWith("!")) {
			annuaire.afficheFiches();
		}
		else if(c.startsWith(".")) {
			test=false;
			System.out.println("bye");
		}
		}
		
	}

}
