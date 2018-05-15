package chapter2;

public class Exercise_1_2_1 {

    public static double nRandomPoints(int N) {

        double[][] points = new double[N][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = Math.random();
                System.out.println(points[i][j]);
            }
        }

        double minDistance = 0.0;

        for (int i = 0; i < points.length; i++) {
            ///
        }


        return 0.0;
    }

    public static double distanceBetweenTwoPoints(double[] a, double[] b) {

        double[] c = new double[2];
        c[0] = a[0] - b[0];
        c[1] = a[1] - b[1];

        System.out.println("c[" + 0 +"] = " + c[0]);
        System.out.println("c[" + 1 +"] = " + c[1]);

        double distance = Math.sqrt(Math.pow(c[0],2) + Math.pow(c[1],2));




        return distance;
    }


    public static void main(String[] args) {

        double[] a = new double[2];
        double[] b = new double[2];

        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random();
            System.out.println("a[" + i +"] = " + a[i]);
            b[i] = Math.random();
            System.out.println("b[" + i +"] = " + b[i]);
        }

        System.out.println(distanceBetweenTwoPoints(a,b));
    }
}
