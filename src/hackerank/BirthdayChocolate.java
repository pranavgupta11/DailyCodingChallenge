package hackerank;


import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(birthday(list, 3, 2));
    }

    static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        for (int i = 0; i < (s.size() - m + 1); i++) {
            int c = 0;
            for (int j = 0; j < m; j++) {
                c += s.get(i + j);
            }
            if (c == d) {
                result++;
            }
        }
        return result;
    }
}
