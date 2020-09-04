package oppgave456;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Fakultet {

	 public static void main(String[]args) {
		 
	     
		 String heltall= showInputDialog ("Skriv inn heltall:"); 
		 
		 int n= Integer.parseInt(heltall);
		 
		 int num = n;
		 int fakultet = 1;
		 
		 while(n>0) {
			 fakultet *= n;
			 n--;
		 }
		 
		 showMessageDialog(null, num + "! =" + fakultet);
		 
		 
		 
		 
		
		 
	     
	}
	}


