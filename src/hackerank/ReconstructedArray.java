package hackerank;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReconstructedArray {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        //list.add(10);
        //list.add(10);

        List<List<Integer>> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        list2.add(1);
        list2.add(1);
        List<Integer> list3 = new ArrayList();
        list3.add(1);
        list3.add(2);
        List<Integer> list4 = new ArrayList();
        list4.add(2);
        list4.add(1);
        List<Integer> list5 = new ArrayList();
        list5.add(2);
        list5.add(2);

        list1.add(list2);
        list1.add(list3);
        list1.add(list4);
        list1.add(list5);

        List<Integer> resultList = new ArrayList();
        resultList = reconstructedArray(list, list1);
        System.out.println(resultList.toString());
    }

    public static List<Integer> reconstructedArray(List<Integer>
                                                           list, List<List<Integer>> list1) {
        List<Integer> result = new ArrayList();


        int numberOfColumns = list.get(0);
        int numberOfRows = (list.size() - 1) / numberOfColumns;
        //System.out.println("Rows "+numberOfRows+" Columns"+numberOfColumns);

        int[][] array2D = new int[numberOfRows][numberOfColumns];
        int count = 1;
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                array2D[i][j] = list.get(count);
                //System.out.println("count "+count+" Value"+list.get(count));
                ++count;
            }
        }
        for (int i = 0; i < array2D.length; i++)
            System.out.println(Arrays.toString(array2D[i]));
        for (int i = 0; i < list1.size(); i++) {
            List<Integer> temp = list1.get(i);
            result.add(array2D[(temp.get(0) - 1)][(temp.get(1) - 1)]);
            //System.out.println(temp.get(0)+" "+temp.get(1));

//System.out.println(array2D[(temp.get(0)-1)][(temp.get(1)-1)]);
        }

        return result;
    }
}
