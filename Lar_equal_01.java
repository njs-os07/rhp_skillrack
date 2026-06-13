package skillrack;
import java.util.*;
public class Lar_equal_01 {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String st = sc.nextLine();
		HashMap<Integer, Integer> m = new HashMap<>();

        int psum = 0;
        int maxl = 0;

        m.put(0, -1);

        for (int i = 0; i < st.length(); i++) {

            if (st.charAt(i) == '1')
                psum += 1;
            else
                psum -= 1;

            if (m.containsKey(psum)) {
                int x = i - m.get(psum);
                maxl = Math.max(maxl, x);
            } else {
                m.put(psum, i);
            }
        }
        System.out.println(maxl);
    }
}
