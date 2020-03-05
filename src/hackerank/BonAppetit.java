package hackerank;

import java.util.ArrayList;
import java.util.List;

public class BonAppetit {

    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        bonAppetit(bill, 1, 7);
    }

    static void bonAppetit(List<Integer> bill, int k, int b) {
        bill.remove(k);
        int result = 0;
        for (int i = 0; i < bill.size(); i++) {
            result += bill.get(i);
        }
        if (result / 2 == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b-(result / 2));
        }
    }
}
