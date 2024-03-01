import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Stats {
	
public static Note meilleureNote(Etudiant e) {
    return Collections.max(e.getListNote());

}
public static Note getMoinsBonneNote(Etudiant e) {
    return Collections.min(e.getListNote());
}
public static float MoyenneGroupe(ArrayList<Etudiant> etudiants) {
	float total=0;
	for(Etudiant etudiant:etudiants) {
		total+=etudiant.getValue();	
	}
	return total/etudiants.size();
}
public static Etudiant meilleureEtudiant(ArrayList<Etudiant> etudiants){
	return Collections.max(etudiants,Comparator.comparing(Etudiant::getValue));
}
public static Etudiant moinsBonEtudiant(ArrayList<Etudiant> etudiants){
	return Collections.min(etudiants,Comparator.comparing(Etudiant::getValue));
}

public static void main(String[] args) {
	Note n1=new Note("maths",10);
	Note n2=new Note("physics",12);
	Note n3=new Note("maths",18);
	Note n4=new Note("physics",18);
	Etudiant e1=new Etudiant("1239568","yassmine");
	Etudiant e2=new Etudiant("1237896","abir");

	e1.addNote(n1.getIntitule(), n1.getValue());
    e1.addNote(n2.getIntitule(), n2.getValue());
    e2.addNote(n3.getIntitule(), n3.getValue());
    e2.addNote(n4.getIntitule(), n4.getValue());
    ArrayList<Etudiant> etudiants = new ArrayList<>();
    etudiants.add(e1);
    etudiants.add(e2);
    e1.addNote("science",15);
    e2.addNote("science",18);
	System.out.println("Comapraison entre deux étudiants :");
    if(e1.compareTo(e2)==1){
    	System.out.println("la plus intelligente : "+e1.getNom());
    }
    else if(e1.compareTo(e2)==0) {
    	System.out.println("les deux ont le même niveau");
    }
    else{
    	System.out.println("la plus intelligente : "+e2.getNom());

    }

    System.out.println("Moyenne du groupe: " + MoyenneGroupe(etudiants));
    System.out.println("Meilleur étudiant: " + meilleureEtudiant(etudiants).getNom());
    System.out.println("Étudiant le moins bon: " + moinsBonEtudiant(etudiants).getNom());
    System.out.println("Moyenne l'étudiant 1: " +e1.getValue());
    System.out.println("Meilleure note de l'étudiant 1: " + meilleureNote(e1).getValue());
    System.out.println("Note la moins bonne de l'étudiant 1: " + getMoinsBonneNote(e1).getValue());
    System.out.println("Tri par nom : ");
    Collections.sort(etudiants, new CompareNom());
    for (Etudiant etudiant : etudiants) {
        System.out.println(etudiant.getNom());
    }

    System.out.println("Tri par matricule : ");
    Collections.sort(etudiants, new CompareMatricule());
    for (Etudiant etudiant : etudiants) {
        System.out.println(etudiant.getMatricule());
    }



}
}