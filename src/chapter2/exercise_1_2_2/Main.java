package chapter2.exercise_1_2_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        int i = sc.nextInt();
        System.out.println();
        Interval[] array = new Interval[i];
        for (int j = 0; j < array.length; j++) {
            System.out.println("enter first point");
            double a = sc.nextDouble();
            System.out.println("enter second point");
            double b = sc.nextDouble();
            array[j] = new Interval(a,b);
        }

        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array.length; k++) {
                if (k != j) {
                    if (array[j].equals(array[k]) == 0) {
                        System.out.println(array[j] + " and " + array[k] + " are intercepting");
                    }
                }
            }

        }
    }

}
