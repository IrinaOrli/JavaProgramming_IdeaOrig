package day21_MultiDimansionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        int [] arr3 = {7,8,9};

        int [][] arr2D = { {1,2,3},{4,5,6},{7,8,9} };

        // 3 dimensional arrays contains 2 d arrays

        //                       0        1       2             0           1           2
        int [][][] arr3D = {{ {1,2,3},{4,5,6},{7,8,9} } , { {10,20,30},{40,50,60},{70,80,90} } };
        //                          0                                   1
        //                     0,1,2   0,1,2   0,1,2         0,1,2      0,1,2      0,1,2

        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[1][1]));
        System.out.println(arr3D[0][2][2]);


        for (int[][] each2D : arr3D) {
            for (int [] each1D : each2D) {
                for (int element : each1D) {
                    System.out.println(element);
                }

            }

            }
        System.out.println("====================");

        int [][][][] arr4D = { {{ {1,2,3},{4,5,6},{7,8,9} } , { {10,20,30},{40,50,60},{70,80,90} } }    };
        //                                              0



        }

    }

