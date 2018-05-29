package chapter2;

public class Exrecises_1_2_4_and_1_2_5 {


    public static void main(String[] args) {
        System.out.println("\tEx 1.2.4");
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        System.out.println(string1);
        System.out.println(string2);

        System.out.println("\tEx 1.2.5");
        String s = "Hello World";
        s.toUpperCase();
        s.substring(6,11);
        System.out.println(s);

        s = s.toUpperCase();
        s = s.substring(6,11);
        System.out.println(s);
    }
}
