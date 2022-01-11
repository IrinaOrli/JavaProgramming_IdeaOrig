package day17_WhileLoop;

public class BranchingStatement2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            if (i == 'C') {
                continue;//skip
            }

            System.out.println(i);

        }
        System.out.println("-------------");

        for (int i1 = 1; i1 <= 10; i1++) {
            if (i1 % 2 != 0) {
                continue;
            }

            System.out.print(i1 +" ");
        }
        System.out.println();
            System.out.println("---------------------");



            for (int i2 = 1; i2 <= 10; i2++) {
                if (i2 % 2 == 0) {
                    continue;
                }

                System.out.print(i2 +" ");

        }
    }
}
