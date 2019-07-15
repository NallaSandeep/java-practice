package org.ftd.git;

public class Conflict1 {
    
    private int[] array = {1, 23, 89, 12};
    
    public void method1() {
    	int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        Conflict1 conflict1 = new Conflict1();
        conflict1.method1();
    }
}
