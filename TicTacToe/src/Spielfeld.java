import java.util.ArrayList;
import java.util.List;

public class Spielfeld {
char [][] spielFeld = new char [3][3];
private List<Kommentator> kommentatoren = new ArrayList<Kommentator>();

public void erstelleSpielfeld(){
for(int i = 0; i < 3 ; i++){
	for(int x = 0; x < 3; x++){
		spielFeld [i][x] = '-';
	}
}
}

public void spielFeldAusgeben(){
	System.out.println("");
	for(int y = 0; y < 3 ; y++){
		System.out.println("");
		for(int z = 0; z < 3; z++){
			System.out.print(spielFeld [y] [z]);
		}
	}

}

public void starten(){
	erstelleSpielfeld();
	spielFeldAusgeben();
}

public void attachKommentator(Kommentator kommi){
	kommentatoren.add(kommi);
}

public char[][] zugMachen(int xko, int yko, char zeichen){
		spielFeld [xko][yko] = zeichen;				
	for(Kommentator hk: kommentatoren){
		hk.kommentarAbgeben(zeichen);
	}
	hatWerGewonnen(spielFeld);
	return spielFeld;
}
public boolean zugPossible(int x, int y){
	
	if(
		(spielFeld[x][y] == '-')
		&&(x > -1)
		&&(y > -1)
		&&(x < 3)
		&&(x < 3)
	   ){
	return true;}
	else{
		return false;
	

}
}
	public void hatWerGewonnen(char[][] feld){
		if(
			((feld[0][0] == 'X')&&
			(feld[0][1] == 'X')&&
			(feld[0][2] == 'X'))
			
			||
			
			((feld[1][0] == 'X')&&
			(feld[1][1] == 'X')&&
			(feld[1][2] == 'X'))
					
			||
					
			((feld[2][0] == 'X')&&
			(feld[2][1] == 'X')&&
			(feld[2][2] == 'X'))
							
			||
			
			((feld[0][0] == 'X')&&
			(feld[1][0] == 'X')&&
			(feld[2][0] == 'X'))
					
			||
					
			((feld[0][1] == 'X')&&
			(feld[1][1] == 'X')&&
			(feld[2][1] == 'X'))
							
			||
							
			((feld[0][2] == 'X')&&
			(feld[1][2] == 'X')&&
			(feld[2][2] == 'X'))
									
			||
			
			((feld[0][0] == 'X')&&
			(feld[1][1] == 'X')&&
			(feld[2][2] == 'X'))
					
			||
					
			((feld[0][2] == 'X')&&
			(feld[1][1] == 'X')&&
			(feld[2][0] == 'X'))
			){
			System.out.println("X HAT GEWONNEN!!! YEAHHHHHHH");
		}
		
		
		else if(
						((feld[0][0] == 'O')&&
						(feld[0][1] == 'O')&&
						(feld[0][2] == 'O'))
						
						||
						
						((feld[1][0] == 'O')&&
						(feld[1][1] == 'O')&&
						(feld[1][2] == 'O'))
								
						||
								
						((feld[2][0] == 'O')&&
						(feld[2][1] == 'O')&&
						(feld[2][2] == 'O'))
										
						||
						
						((feld[0][0] == 'O')&&
						(feld[1][0] == 'O')&&
						(feld[2][0] == 'O'))
								
						||
								
						((feld[0][1] == 'O')&&
						(feld[1][1] == 'O')&&
						(feld[2][1] == 'O'))
										
						||
										
						((feld[0][2] == 'O')&&
						(feld[1][2] == 'O')&&
						(feld[2][2] == 'O'))
												
						||
						
						((feld[0][0] == 'O')&&
						(feld[1][1] == 'O')&&
						(feld[2][2] == 'O'))
								
						||
								
						((feld[0][2] == 'O')&&
						(feld[1][1] == 'O')&&
						(feld[2][0] == 'O'))
				){
			System.out.println("O HAT GEWONNEN!!! YEAHHHHHHH");
		}
	}

}