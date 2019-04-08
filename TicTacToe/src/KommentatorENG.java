
public class KommentatorENG extends Kommentator {
	
	public KommentatorENG(Spielfeld feld){
		this.feld = feld;
		this.feld.attachKommentator(this);
	}
	
	@Override
	public void kommentarAbgeben(char zeichen) {
		System.out.println("");
		System.out.print("Harry: ");
		if(zeichen == '-'){
			System.out.println("Woah! Looks like he removed his mistake !");
		}
		else{
		System.out.println("The player just placed "+zeichen+", now that's quality gameplay!");
		}
	}

}
