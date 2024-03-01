
public class Note implements Comparable<Note> ,Statisticable {
private String intitule;
private float note;
Note(String intitule,float note){
	this.intitule=intitule;
	this.note=note;
}
public String getIntitule() {
	return intitule;
}

@Override
public float getValue() {
	return note;
}

@Override
public int compareTo(Note o) {
	if(this.getValue()==o.getValue())
		return 0;
	else if(this.getValue()>o.getValue())
		return 1;
	else
		return -1;
}
}
