package oppgave456;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Karakter {
	public static void main(String[] args) {
		

		int ANT_STUD = 10;
		for(int i= 1; i<=ANT_STUD; i++) {
		String karTxt = showInputDialog("Oppnådd poengsum:  "); 
	    int karakter = Integer.parseInt (karTxt);
		
		// Karakter 
	    
	    if(karakter>-1 && karakter<101) {
		if(karakter>0 && karakter<=39) {
			showMessageDialog(null, "Karakter: " + "F");
			}
		
		if(karakter>=40 && karakter<=49) {
			showMessageDialog(null,"Karakter: " + "E");
			}
		
		if(karakter>=50 && karakter<=59){
			showMessageDialog(null,"Karakter: " + "D");
			}
		
		if(karakter>=60 && karakter<=79){
			showMessageDialog(null,"Karakter: " + "C");}
		
		if(karakter>=80 && karakter<=89){
			showMessageDialog(null,"Karakter: " + "B");}
	    
		if(karakter>=90 && karakter<=100){
			showMessageDialog(null, "Karakter: " + "A");} 
	    }
		
		
		else {
			while (karakter<0 && karakter>100) {
				i++;
				karakter = Integer.parseInt (karTxt);
			}
	
		showMessageDialog(null, karakter + " er en ugyldig poengsum, skriv inn på nytt.");
		
		}
		}	
		}
	}





