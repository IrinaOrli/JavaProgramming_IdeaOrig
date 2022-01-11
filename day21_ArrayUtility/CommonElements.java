package day21_ArrayUtility;

public class CommonElements {
    public static void main(String[] args) {

       int [] array1= {1,2,3,4,5,4};
       int []  array2= {4,5,6,7,8,5};


       String common = "";
        for (int i : array1) {
            for (int i1 : array2) {
                if (i == i1) {

                    if (common.contains(i+"")) {
                        continue;
                    }
                    common += i + " ";
                }
                }
            }
        System.out.println(common);
            }
        }
/*Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5*/