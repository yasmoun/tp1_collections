import java.util.ArrayList;
public class Etudiant implements Comparable<Etudiant>,Statisticable {
private String matricule;
public String getMatricule() {
	return matricule;
}
public String getNom() {
	return nom;
}
public ArrayList<Note> getListNote() {
	return listNote;
}
public void setListNote(ArrayList<Note> listNote) {
	this.listNote = listNote;
}

private String nom;
private ArrayList<Note> listNote;
Etudiant(String matricule,String nom){
	this.matricule=matricule;
	this.nom=nom;
	this.listNote=new ArrayList<Note>();
}
public void addNote(String intitule,float note) {
	listNote.add(new Note(intitule,note));
}


@Override
public float getValue() {
	 float total = 0;
	    for (Note note : listNote) {
	        total += note.getValue();
	    }
	    return total / listNote.size();
}
@Override
public int compareTo(Etudiant o) {
	if(this.getValue()==o.getValue())
		return 0;
	else if(this.getValue()>o.getValue())
		return 1;
	else
		return -1;

}

}
