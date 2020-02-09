package hackerank;

public class ElectronicsShop {
    public static void main(String[] args) {
        int[] keyboards=new int[]{5,2,8};
        int[] drives = new int[]{3,1};
        int b = 10;
        System.out.println(getMoneySpent(keyboards,drives,b));
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;
        if (keyboards.length > drives.length) {
            for (int i = 0; i < keyboards.length; i++) {
                for (int j = 0; j < drives.length; j++) {
                    if (keyboards[i] + drives[j] < b)
                        if(max<keyboards[i] + drives[j]) {
                            max = keyboards[i] + drives[j];
                        }
                }
            }
        } else {
            for (int i = 0; i < drives.length; i++) {
                for (int j = 0; j < keyboards.length; j++) {
                    if (drives[i] + keyboards[j] < b)
                        if(max<drives[i] + keyboards[j]) {
                            max = drives[i] + keyboards[j];
                        }

                }
            }
        }
        return max;

    }
}
