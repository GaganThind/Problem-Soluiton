import java.util.Arrays;

public class Discount {

	public static void main(String[] args) {
		System.out.println(value(new int[] {100, 401, 200, 398, 512}, 21));
	}
	
	private static int value(int[] prices, int discount) {
		
		int sum = Arrays.stream(prices)
						.boxed()
						.reduce(0, (total, arg) -> total + arg);
		
		int maxPrice = Arrays.stream(prices)
							.max()
							.getAsInt();
		
		float discountValue = (maxPrice * discount) / 100.0f;
		
		return sum - (int) Math.ceil(discountValue);
	}

}
