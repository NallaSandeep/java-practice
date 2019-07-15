package org.ftd.git;

public class Conflict1 {
    
    private int[] array = {1, 23, 89, 12, 34};
    
    public void method1() {
        int sum = 0;
        for (int i: array) {
            System.out.println(i);
            sum += i;
        }
<<<<<<< HEAD
        System.out.println("Sum2: " + sum);
=======
        System.out.println("Sum1: " + sum);
>>>>>>> branch 'master' of https://github.com/NallaSandeep/java-practice
    }

    public static void main(String[] args) {
        Conflict1 conflict1 = new Conflict1();
        conflict1.method1();
    }
}
