package chapter1.exercises.creativeTasks;

public class creativeExercises {

    //task26
    public static int[] threeNums(int a, int b, int c, int t) {

        if (a > b) {
            t = a;
            a = b;
            b = t;
        }

        if (a > c) {
            t = a;
            a = c;
            c = t;
        }

        if (b > c) {
            t = b;
            b = c;
            c = t;
        }

        return new int[]{a,b,c};
    }

    //Task 27
    public static int counter = 0;

    public static double binomianl(int N, int k, double p) {
        counter++;
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        return (1.0 - p) * binomianl(N-1, k, p) + p*binomianl(N-1, k-1,p);
    }

    public static void main(String[] args) {

        System.out.println("Task 26");
        System.out.println("threeNums(4,2,7,9)");
        for (int A: threeNums(4,2,7,9)
             ) {
            System.out.println(A);
        }

        System.out.println("Task 27");
        counter = 0;
        System.out.println(binomianl(10,5,0.1));
        System.out.println("Counter = " + counter);
        System.out.println();
        counter = 0;
        System.out.println(binomianl(20,10,0.2));
        System.out.println("Counter = " + counter);






    }

}
