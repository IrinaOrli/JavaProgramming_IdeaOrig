package day26_Practice;

public class Merge2 {
    public static int[]merge (int []arr1, int []arr2){
        int [] result = new int[arr1.length+ arr2.length];
        int i =0;
        for (int each1 : arr1) {
            result[i++]=each1;
        }
        for (int each2 : arr2) {
            result[i++]=each2;
        }
        return result;
    }

}
