package com.bridgelabz.oops;

public class DeckOfCards {
	
	/*
	* The main function is written to take input from the user and print
	* the deck of cards distributed among 4 players 
	*/
	public static void main(String[] args) {
		String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] Ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		int n = Suits.length * Ranks.length;
		String[] deck = new String[n];
		for (int i = 0; i < Ranks.length; i++) {
			for (int j = 0; j < Suits.length; j++) {
				deck[Suits.length * i + j] = Ranks[i] + " " + Suits[j];
			}
		}
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		System.out.println("Total numver of deck of cards are " + deck.length);
		for (int i = 0; i < 4; i++) {
			System.out.println("----- Person " + (i + 1) + " -----");
			for (int j = 0; j < 9; j++) {
				System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) + ")");
			}
		}
	}
}
