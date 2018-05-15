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

    public static void main(String[] args) {

        System.out.println("Task 26");
        System.out.println("threeNums(4,2,7,9)");
        for (int A: threeNums(4,2,7,9)
             ) {
            System.out.println(A);
        }

    }

}
