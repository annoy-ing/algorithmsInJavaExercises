package chapter2;

public class Exercise_1_2_1 {





    public static double[][] nRandomPoints(int N) {

        double[][] points = new double[N][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = Math.random();

            }
        }

        return points;
    }

    public static double minDistance(double[][] array){
        //setting starting distance bigger than could be between points in 1x1 square
        double minDist = 10.0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (equals(array[i], array[j]) == 0){
                    if (distanceBetweenTwoPoints(array[i], array[j]) < minDist) {
                        minDist = distanceBetweenTwoPoints(array[i], array[j]);
                        System.out.println("current min distance = " + minDist);
                    }
                }
            }
        }

        return minDist;
    }

    public static int equals(double[] a, double[] b){
        if ((a[0] == b[0]) && (a[1] == b[1])) return 1;
        else return 0;
    }

    public static double distanceBetweenTwoPoints(double[] a, double[] b) {

        double[] c = new double[2];
        c[0] = a[0] - b[0];
        c[1] = a[1] - b[1];

        double distance = Math.sqrt(Math.pow(c[0],2) + Math.pow(c[1],2));
        return distance;
    }


    public static void main(String[] args) {

        double[][] array = nRandomPoints(30);
        double minDist = minDistance(array);

        System.out.println("\nFinal minimal distance = " + minDist);


    }
}
