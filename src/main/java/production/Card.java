package production;

public class Card {

	protected String[] suits = { "Spades", "Clubs", "Hearts", "Diamonds" };
	
	protected int[] values = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

	public String convertToString(int number) {
		if(isBetweenTwoAndNine(number)) {
			return "" + number;
		} if(number == 10) {
			return "T";
		} if(number == 11) {
			return "J";
		} if(number == 12) {
			return "Q";
		} if(number == 13) {
			return "K";
		} if(number == 14) {
			return "A";
		}
		return "Not a valid card value";
		}
	
	public String convertToString(String message) {
		return "S";
	}

	private boolean isBetweenTwoAndNine(int number) {
		return number == 2 || number == 3 || number == 4 || number == 5 || number == 6 || number == 7 || number == 8 || number == 9;
	}
	
}
