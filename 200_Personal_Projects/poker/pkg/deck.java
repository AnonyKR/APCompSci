package pkg;
import pkg.useableCard;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;


public class deck{
	ArrayList<Integer> cards;
	ArrayList<Integer> discards;
	public deck() {
		this.cards = new ArrayList<Integer>();
		this.discards = new ArrayList<Integer>();
		for (int i = 0; i < 52; i++) {
			this.cards.add(i);
		}
	}
	
	public deck(int setsOfDecks) {
		this.cards = new ArrayList<Integer>();
		this.discards = new ArrayList<Integer>();
		for (int i = 0; i < 52; i++) {
			for (int j = 0; j < setsOfDecks; j++)
				this.cards.add(i);
		}
	}
	
	public void shuffle() {
		this.cards.addAll(this.discards);
		this.discards.clear();
		Collections.shuffle(this.cards);
	}

	public int pullACard() {
		if (this.cards.size() < 1) {
			this.shuffle();
		}
		holdIntTemp = this.cards.get(0);
		this.cards.remove(0);
		return holdIntTemp;
	}

	public ArrayList<Integer> pullCards(int numOfCards) {
		ArrayList<Integer> returnCards = new ArrayList<Integer>();
		if (this.cards.size() <= numOfCards) {
			boolean moreDraws = true;
			if (this.cards.size() == numOfCards) {
				moreDraws = false;
			}
			returnCards.addAll(this.cards);
			this.shuffle();
			if (!moreDraws) {
				return returnCards;
			}
		}
		while(returnCards.size() != numOfCards) {
			returnCards.add(this.cards.get(0));
			this.cards.remove(0);
		}
		return returnCards;
	}
}
