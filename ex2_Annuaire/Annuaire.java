import java.util.HashMap;
import java.util.Map;

public class Annuaire {
	private Map<String, Fiche> annuaire;
	public Annuaire() {
	 this.annuaire=new HashMap<String, Fiche> ();
	}
	public void ajoutFiche(String nom, int numero, String adresse) {
        annuaire.put(nom, new Fiche(nom, adresse, numero));
    }
	public Fiche rechercheFiche(String nom) {
        return annuaire.get(nom);
    }
    public void afficheFiches() {
        for (Fiche fiche : annuaire.values()) {
            System.out.println(fiche);
        }
    }
}
