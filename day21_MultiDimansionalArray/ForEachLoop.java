package day21_MultiDimansionalArray;

public class ForEachLoop {
    public static void main(String[] args) {
        int [][] arr2D = {{1,2,3},{4,5,6,7,}, {8,9,10,11,12}};

       for (int[] each1DArray : arr2D) {
            for (int i : each1DArray) {
               System.out.println(i);
            }
        }

      }



    }
/*

    public static void main(String[] args) {

// index of the elements:  0 1 2     0 1 2 3    0 1 2 3 4
        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };
        // index of arrays:       0         1            2

*/
