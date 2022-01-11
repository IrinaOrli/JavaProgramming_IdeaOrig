package day20_Array;

public class Common {
    public static void main(String[] args) {
       int [] arr1 = {1,2,7,3, 0, 4,5,5,2};
        int [] arr2 = {4,5,6,7,8,2,2,7,9};


        String common = "";
        for (int j = 0; j < arr1.length; j++) {

            int count = 0;
            for (int i = 0; i < arr2.length; i++) {

                if ( arr1[j]==arr2[i]){
                count++;
                }
            }
              if (count>=1){
                 if (common.contains(arr1[j]+"")){
                  continue;
                 }
                     common +=arr1[j];
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