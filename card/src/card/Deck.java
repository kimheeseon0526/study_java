package card;

public class Deck {
	Card[] cards = new Card[52];
	int count;
	{	
		int c = 0 ;
		for(int i =0; i < 4; i++) {
			for(int j =0; j < 13; j++) {
//				cards[i * 13 + j] = new Card(i, j);
				cards[c++] = new Card(i,j);
			}
		}
	}
	Deck print() {
		for(Card c : cards) {
		System.out.println(c);
		}
		return this;
	}
	
	Card pick() {	//카드 한 장 뽑아야하기 때문에 Card 타입
		return cards[count++];
	}
	
	Deck shuffle() {	//섞기
		for(int i = 0; i < cards.length ; i++) {
			int r = (int)(Math.random() * 52);
			Card tmp = cards[i];
			cards[i] = cards[r];
			cards[r] = tmp;			
		}
		return this;
		
	}
	public static void main(String[] args) {
		new Deck().shuffle().print().shuffle().print();
	}
}
//Deck 에서 shuffle