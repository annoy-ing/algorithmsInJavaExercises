package chapter2.exercise_1_2_3;

import java.awt.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        int i = sc.nextInt();
        System.out.println("enter min");
        double min = sc.nextDouble();
        System.out.println("enter max");
        double max = sc.nextDouble();
        StdDraw.setPenColor(Color.green);
        StdDraw.line(min,min,min,max);
        StdDraw.line(min,max, max,max);
        StdDraw.line(max,max,max,min);
        StdDraw.line(min,min,max,min);



        RandomLineInRange[] array = new RandomLineInRange[i];
        SimpleCounter interceptingPairs = new SimpleCounter();
        SimpleCounter alligningPairs = new SimpleCounter();


//        for (RandomLineInRange l : array) {
//            l = new RandomLineInRange(min,max);
//            l.drawThisLine();
//            System.out.println("Drawing line " + l.toString());
//        }

        for (int j = 0; j < array.length; j++) {
            array[j] = new RandomLineInRange(min,max);
            array[j].drawThisLine();
            System.out.println("Drawing line " + array[j].toString());
        }

        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < j; k++) {
                if (array[j].isIntercepting(array[k])) {
                    //System.out.println(array[j] + " and " + array[k] + " are intercepting");
                    interceptingPairs.increment();
                }
                if (array[j].isAlligning(array[k])){
                    alligningPairs.increment();
                }
            }
        }

        System.out.println("intercepting pairs = " + interceptingPairs.getCount());
        System.out.println("alligning pairs = " + alligningPairs.getCount());
    }
}
