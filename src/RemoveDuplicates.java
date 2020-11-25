import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] inputArr = new int[] { 1, 3, 3, 4, 5, 7, 6, 8, 7, 8 };
		System.out.println(Arrays.toString(removeDuplicates(inputArr)));
	}

	private static int[] removeDuplicates(int[] inputArr) {
		List<Integer> uniqueValues = Arrays.stream(inputArr)
											.boxed()
											.distinct()
											.collect(Collectors.toList());
		
		int[] returnArr = uniqueValues.stream()
										.mapToInt(Integer::intValue)
										.toArray();
		return returnArr;
	}

}
