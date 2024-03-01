
public class Fiche {
private String nom;
private String adresse;
private int numero;

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}
public Fiche(String nom, String adresse, int numero) {
    this.nom = nom;
    this.numero = numero;
    this.adresse = adresse;
}
@Override
public String toString() {
	return "nom: "+nom+", numéro: "+numero+", adresse: "+adresse;
}
}
