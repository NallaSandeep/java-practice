package org.ftd.git;

public class Conflict1 {
    
    private int[] array = {1, 23, 89, 12, 34};
    
    public void method1() {
        int sum = 0;
        for (int i: array) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum1: " + sum);
    }

    public static void main(String[] args) {
        Conflict1 conflict1 = new Conflict1();
        conflict1.method1();
    }
}
