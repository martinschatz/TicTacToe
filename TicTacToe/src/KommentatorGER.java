
public class KommentatorGER extends Kommentator{

	public KommentatorGER(Spielfeld feld){
		this.feld = feld;
		this.feld.attachKommentator(this);
	}
	
	@Override
	public void kommentarAbgeben(char zeichen) {
		System.out.println("");
		System.out.print("Harald: ");
		if(zeichen == '-'){
			System.out.println("Der Spieler hat seinen Fehler revidiert!");
		}
		else{
		System.out.println("Der Spieler hat ein "+zeichen+" platziert! OHJA!");
		
	}
  }

}
