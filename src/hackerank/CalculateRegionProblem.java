package hackerank;


import java.util.List;
import java.util.ArrayList;

public class CalculateRegionProblem {
    public static void main(String args[]) {
        List<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(1);

        List<Integer> list2 = new ArrayList();
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        System.out.println("Region is " + calculateRegion(list2));

    }

    public static int calculateRegion(List<Integer> list) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += calculateRegion(list, list.get(i));
        }
        return result;
    }

    public static int calculateRegion(List<Integer> list, int height) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= height) {
                ++result;
            } else {
                break;
            }
        }
        return result;
    }
}