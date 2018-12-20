package com.bridgelabz.functionalprogram;
import com.bridgelabz.util.*;
import java.util.*;
public class TicTacToe {
	public static void main(String[] args) {
		FunctionalUtilty fu=new FunctionalUtilty();
		do{
            fu.newBoard();
            fu.play();
            System.out.println ("Would you like to play again (Enter '1')? ");
            Scanner in =new Scanner(System.in);
            int ch=in.nextInt();
		}while(ch==1);
	}
}
