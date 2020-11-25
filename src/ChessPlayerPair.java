
public class ChessPlayerPair {

	public static void main(String[] args) {
		System.out.println(findPairCount(10000));
	}
	
	private static int findPairCount(int playerCount) {
		if (0 == playerCount || 1 == playerCount) {
			return 0;
		} else if (2 == playerCount) {
			return 1;
		}
		
		return (playerCount - 1) + findPairCount(playerCount - 1);
	}

}
