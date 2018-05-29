package chapter2.exercise_1_2_6;

public class Main {


    //one line method
    public static boolean isCycleRotated(String s1, String s2) {
        return s1.length() == s2.length() && (s1+s1).contains(s2);

    }

    public static void main(String[] args) {

        String s1 = "abcdef";
        String s2 = "efabcd";

        System.out.println(isCycleRotated(s1,s2));

    }

}
