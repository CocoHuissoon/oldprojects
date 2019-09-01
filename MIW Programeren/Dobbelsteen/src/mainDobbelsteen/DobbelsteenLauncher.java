package mainDobbelsteen;

import java.util.Scanner;

public class DobbelsteenLauncher {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Welk karakter moet ik gebruiken voor het oog: ");
		String s=input.nextLine();
		char oog=s.charAt(0);
		int dice1=0;
		
		
		//System.out.println(dice1);
		do {
		dice1 = (int) (Math.random()*6)+1;
		//System.out.println(dice2);
		if(dice1==1) {System.out.printf("\n %c\n %c\n %c\n",oog,oog,oog);}
		else if (dice1==2) {System.out.printf("\n%c %c\n%c %c\n%c %c\n",oog,oog,oog,oog,oog,oog);}
		else if(dice1==3) {System.out.printf("\n%c\n %c\n  %c\n",oog,oog,oog);}
		else if(dice1==4) {System.out.printf("\n%c %c\n\n%c %c\n",oog,oog,oog,oog);}
		else if(dice1==5) {System.out.printf("\n%c %c\n %c\n%c %c\n",oog,oog,oog,oog,oog);}
		}while(dice1<6);
	
		System.out.printf("\n%c %c\n%c %c\n%c %c",oog,oog,oog,oog,oog,oog);
		
		

	}

}

