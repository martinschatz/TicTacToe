import java.util.Scanner;

public class testi {
	static int xdavor = 0;
	static int ydavor = 0;
	static Scanner xkoordinate = new Scanner(System.in);
	static Scanner ykoordinate = new Scanner(System.in);
	static int xkoord = 0;
	static int ykoord = 0;
	static Spielfeld feld = new Spielfeld();
	public static void main(String[] args) {
	
		
		
		ZeichenFabrik fabrik =  ZeichenFabrik.getInstance();
		CommandUndo kommando = new CommandUndo();
		new KommentatorENG(feld);
		new KommentatorGER(feld);
		feld.starten();

		for(int i = 0; i < 10; i++){
			
			
		
			Scanner command = new Scanner(System.in);
			System.out.println("");
			
			
			
			if(i!=0){
				System.out.println("Möchten Sie den Zug rückgangig machen? [1 = ja] ");
				int cmd = command.nextInt();
				if(cmd == 1){
					feld = kommando.changeField(xdavor, ydavor, feld);
					i--;
				}
			}
			
			
			
			
			koordinatenAbfragen();
			
			
			
			if(i == 0 || i == 2 || i == 4 || i == 6 || i == 8){
				char p = fabrik.getZeichen("Kreuz").gibZeichenZurueck();
				feld.zugMachen(xkoord, ykoord, p);
			}
			else if(i == 1 || i == 3 || i == 5 || i == 7 ){
				char p = fabrik.getZeichen("Kreis").gibZeichenZurueck();
				feld.zugMachen(xkoord, ykoord, p);
			}
			else {
				System.out.println("GAME OVER");
			}
			feld.spielFeldAusgeben();
			
		}
		
	
}
	
	public static void koordinatenAbfragen(){
		System.out.println("Y-Koordinate: ");
		xkoord = xkoordinate.nextInt();
		xdavor = xkoord;
		System.out.println("X-Koordinate: ");
		ykoord = ykoordinate.nextInt();
		ydavor = ykoord;
		if(!feld.zugPossible(xkoord, ykoord)){
			System.out.println("Dieser Zug ist nicht möglich!");
			koordinatenAbfragen();
		}
	}
}
