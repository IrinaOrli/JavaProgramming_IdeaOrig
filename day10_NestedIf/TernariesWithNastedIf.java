package day10_NestedIf;

public class TernariesWithNastedIf {
    public static void main(String[] args) {
        int s = 50;

        String result= (s>=0&&s<=100)? (s>=60) ? "Passed" : "Failed" : "Invalid input";
        System.out.println(result);
    }
}
