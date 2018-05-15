package chapter1.exercises;

import java.util.*;

public class Exercises {

    public static boolean isFromZeroToOne(double x, double y) {
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            return true;
        } else return false;
    }

    public static void isEqual(){


        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int inputValue1 = userInput.nextInt();
        System.out.println("Enter second number: ");
        int inputValue2 = userInput.nextInt();
        System.out.println("Enter third number: ");
        int inputValue3 = userInput.nextInt();

        if ((inputValue1 == inputValue2) && (inputValue1 == inputValue3)){
            System.out.println("    Numbers are equal");
        } else {
            System.out.println("    Numbers aren't equal");
        }
    }

    public static void superProgram() {
        int f = 0;
        int g = 1;
        for (int i = 0; i < 15; i++) {
            System.out.println("    " + f);
            f = f + g;
            g = g - f;
        }
    }

    public static void superProgram2(){
        System.out.println("    a.");
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0 / t + t) / 2;
        System.out.printf("%.5f\n", t);

        System.out.println("    b.");
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println("    " + sum);
        System.out.println("    c.");
        sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println("    " + sum);

    }

    public static void superProgram3() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;


        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i: a
             ) {
            System.out.println(i);
        }

    }


    public static String intToBinary(int n) {
        String s = "";
        for (int i = n; i > 0; i /= 2) {
            s = (i % 2) + s;

        }
        return s;
    }

    public static boolean[][] randomBooleanArrayGenerator() {
        int height = randomWithRange(4,9);
        int weight = randomWithRange(5,9);

        boolean[][] array = new boolean[height][weight];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (randomWithRange(0, 1) == 0) {
                    array[i][j] = false;
                } else array[i][j] = true;
            }
        }
        return array;
    }

    public static void booleanArrayOutput(boolean[][] array) {





        System.out.print("   ");
        for (int i = 0; i < array[0].length ; i++) {
            System.out.print(" " + (i) + " ");
        }
        System.out.print("\n");

        for (int i = 0; i < array.length ; i++) {
            System.out.print("  " + (i));
            for (int j = 0; j < array[0].length; j++) {

                if (array[i][j]) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }


            }
            System.out.print("\n");
        }



    }

    public static int randomWithRange(int min, int max) {
        int range = Math.abs(max - min) + 1;
        //System.out.println((int)(Math.random() * range) + (min <= max ? min : max));
        return (int)(Math.random() * range) + (min <= max ? min : max);

    }

    public static boolean[][] transposedArray(boolean[][] orginalArray) {
        int height = orginalArray.length;
        int weight = orginalArray[0].length;

        boolean[][] transArr = new boolean[weight][height];

        for (int i = 0; i < orginalArray.length; i++) {
            for (int j = 0; j < orginalArray[0].length; j++) {
                transArr[j][i] = orginalArray[i][j];
            }
        }
        return transArr;
    }

    public static int lg(int N) {
        int i = 0;

        while ((i+1)*(i+1) < N) {
            i++;
        }

        return i;
    }

    public static int[] histogram(int[] a, int M){
        int[] hist = new int[M];
        for (int i = 0; i < hist.length; i++) {
            hist[i] = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) hist[i]++;
            }
        }

        return hist;
    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n-3) + exR1(n-2) + n;
    }

    public static int mysteery(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mysteery(a * a, b / 2);
        return mysteery(a * a,b / 2);
    }

    public static long F(int N) {
        //recurtion
//        if (N == 0) return 0;
//        if (N == 1) return 1;
//        return F(N-1) + F(N-2);


        long[] Fib = new long[N+1];
        if (N == 0) return 0;
        if (N == 1) return 1;
        Fib[0] = 0;
        Fib[1] = 1;
        for (int i = 2; i < Fib.length; i++) {
            Fib[i] = Fib[i-1] + Fib[i-2];
        }
        return Fib[N];

    }

    public static void Fibbonaci() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " :" + F(i));
        }
    }

    public static long Factorial(int N) {
        if (N == 0) return 1;
        else return N * Factorial(N-1);
    }

    public static long lnOfFactorial(int N) {
        if (N == 0) return 0;
        if (N == 1) return 0;
        else return (long) (Math.log(N) + lnOfFactorial(N-1));
    }

    private static int rank(int key, int[] arr, int lo, int hi, int depth) {

        if (depth != 0) {
            System.out.println();
        }

        for (int i = 0; i < depth; i++) {

            System.out.print(" ");
        }

        System.out.print("lo: " + lo + " - hi: " + hi);

        if (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (key < arr[mid]) {
                return rank(key, arr, lo, mid-1, ++depth);
            } else if (key > arr[mid]) {
                return rank(key, arr, mid+1, hi, ++depth);
            } else {
                return mid;
            }
        } else {
            return -1;
        }

    }

    public static void binarySearch(int key, int ... array) {
        System.out.println(key);

        Arrays.sort(array);

       int index = rank(key,array, 0, array.length-1,0);
        System.out.println();
        System.out.println("Index = " + index);
        System.out.println("\nExpected:");
        System.out.println("lo: 0 - hi: 6\n" +
                " lo: 0 - hi: 2\n" +
                "Index: 1");
    }

    public static int euclidAlg(int a, int b) {
        int c = a % b;
        if (c == 0) return b;
        else return euclidAlg(b,c);
    }






    public static void main(String[] args) {
        System.out.println("1.1.1");
        System.out.println("    a. (0+15)/2 = " + ((0 + 15) / 2));
        System.out.println("    b. 2.0e-6 * 100000000.1 = " + (2.0e-6 * 100000000.1));
        System.out.println("    c. true && false || true && true = " + (true && false || true && true));
        System.out.println();
        System.out.println("1.1.2");
        System.out.println("    a. (1 + 2.236) / 2 = " + ((1 + 2.236) / 2));
        System.out.println("    b. 1 + 2 + 3 + 4.0 = " + (1 + 2 + 3 + 4.0));
        System.out.println("    c. 4.1 >= 4 = " + (4.1 >= 4));
        System.out.println("    d. 1 + 2 + \"3\" = " + (1 + 2 + "3"));
        System.out.println();
        System.out.println("1.1.3");
        //isEqual();
        System.out.println("1.1.4");
        System.out.println();
        System.out.println("1.1.5");
        System.out.println("    isFromZeroToOne(3.3, 1.1) = " + isFromZeroToOne(3.3, 1.1));
        System.out.println("    isFromZeroToOne(0.758, 0.9) = " + isFromZeroToOne(0.758, 0.9));
        System.out.println();
        System.out.println("1.1.6");
        System.out.println("    Program output:");
        superProgram();
        System.out.println("1.1.7");
        superProgram2();
        System.out.println("1.1.8");
        System.out.println("    " + 'b');
        System.out.println("    " + 'b' + 'c');
        System.out.println("    " + 'a' + 4);
        System.out.println();
        System.out.println("1.1.9");
        System.out.println("    Integer.toBinaryString(25) = " + Integer.toBinaryString(26));
        System.out.println("    intToBinary(25) = " + intToBinary(26));
        System.out.println("1.1.11");
        booleanArrayOutput(randomBooleanArrayGenerator());
        System.out.println();
        System.out.println("1.1.12");
        superProgram3();
        System.out.println();
        System.out.println("1.1.13");
        boolean[][] originalArray = randomBooleanArrayGenerator();
        System.out.println("    boolean[][] originalArray = randomBooleanArrayGenerator();");
        System.out.println("    booleanArrayOutput(originalArray): ");
        booleanArrayOutput(originalArray);
        System.out.println("    booleanArrayOutput(transposedArray(originalArray)): ");
        booleanArrayOutput(transposedArray(originalArray));
        System.out.println();
        System.out.println("1.1.14");
        System.out.println("    lg(456) = " + lg(456));
        System.out.println("    lg(712855) = " + lg(712855));
        System.out.println("    lg(9) = " + lg(9));
        System.out.println();
        System.out.println("1.1.15");
        int[] a = {1,3,4,2,1,1,0,0,2,3,4};
        int M = 6;
        System.out.println("    int[] a = {1,3,4,2,1,1,0,0,2,3,4};");
        System.out.println("    int M = 6;");
        System.out.println("    histogram:");
        for (int i = 0; i < histogram(a,M).length; i++) {
            System.out.println(i + ": " + histogram(a,M)[i]);
        }

        System.out.println();
        System.out.println("1.1.16");
        System.out.println("exR1(6)= " + exR1(6));
        System.out.println();
        System.out.println("1.1.17");
        System.out.println("    mysteery(2,25) = " + mysteery(2,25));
        System.out.println("    mysteery(3,11) = " + mysteery(3,11));
        System.out.println("1.1.18");
        System.out.println("1.1.19");
        Fibbonaci();
        System.out.println("1.1.20");
        int l = 8;
        System.out.println("    l = " + l);
        System.out.println("    lnOfFactorial(l) = " + lnOfFactorial(l));
        int z = 0;
        for (int i = 1; i <= l; i++) {
            z += Math.log(i);
        }
        System.out.println("    " + z);
        System.out.println("1.1.21");
        System.out.printf("%8s %7s %7s %7s","Names","Number1","Number2","Result\n");
        System.out.println("1.1.22");
        binarySearch(4,1,2,3,4,1,2,3,4,1,3);
        System.out.println("1.1.23");
        System.out.println("euclidAlg(1071,462) = " + euclidAlg(1071,462));
        System.out.println("euclidAlg(105,24) = " + euclidAlg(105,24));











    }

}
