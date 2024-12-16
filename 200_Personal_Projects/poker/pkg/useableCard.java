package pkg;

interface useableCard {
    default String cardStr(int card) {
        String shape;
		switch(card / 13) {
			case 0:
				shape = new String("\u2660"); //spade filled
				break;
			case 1:
				shape = new String("\u2663"); //clubs filled
				break;
			case 2:
				shape = new String("\u2661"); //heart empty
				break;
			case 3:
				shape = new String("\u2662"); //diamond empty
				break;
			default:
				shape = new String("error");
		}
		switch(card % 13) {
			case 9:
				shape += "J";
				break;
			case 10:
				shape += "Q";
				break;
			case 11:
				shape += "K";
				break;
			case 12:
				shape += "A";
				break;
			default:
				shape += (card + 2);
		}
		return shape;
    }
}