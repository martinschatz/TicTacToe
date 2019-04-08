
public class ZeichenFabrik {
	
	private static ZeichenFabrik instance = new ZeichenFabrik();
	
	private ZeichenFabrik(){}
	
	public static ZeichenFabrik getInstance(){
	
		return instance;
	}
	
	public IZeichen getZeichen(String eingabe){
		if(eingabe.equals("Kreis")){
			return new Kreis();
		}
		else if(eingabe.equals("Kreuz")){
			return new Kreuz();
		}
		else{
			System.out.println("Dies ist kein verfügbares Zeichen.");
			System.out.println("Bitte geben Sie entweder Kreuz oder Kreis ein.");
			return null;
		}
		
	}
	
	
}
