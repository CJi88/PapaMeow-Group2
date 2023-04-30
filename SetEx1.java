import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class SetEx1 {

	public static void main(String[] args) {

		// Object test[] = {"string1","string2"};
		// Object test2[] = {"string1","string2"};
		// System.out.println(test[0]);

		// Set<Object> s = new HashSet<>();

		// s.add(test);
		// s.add(test2);

		// for(Object n : s){
		// 	// String[] st = Arrays.copyOf(n,n.l)
		// 	System.out.println(n);
		// }

		Set<Integer> num = new HashSet<>();

		num.add(2);
		num.add(3);

		int sum = 0;

		for(int n : num) {
			sum += n;
		}

		System.out.println("Total:"+sum);
	}

}
