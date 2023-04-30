import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SetEx2 {
	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>();

		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(1);

		Set<Integer> el = new HashSet<>();

		el.addAll(ar);

		System.out.println(el);
	}
}
