package ch01;

public class MyFirstApp {
    public static void main(String[] args) {
        int x = 1;
        String name = "Dirk";
        x = x * 17;
        System.out.println("x is " + x);

        while (x > 12) {
            x = x - 1;
            System.out.println(x);
        }
        System.out.println("x : " + x);

        for (int i = 0; i < 10; i = i + 1)
            System.out.println("i is now " + i);

        if (x == 10) {
            System.out.println("x must to be 10");
        } else {
            System.out.println("x isn't 10");
        }
        if ((x < 3) && (name.equals("Dirk"))) {
            System.out.println("Gently");
        }
        System.out.println("this line runs no matter what");

        System.out.println("Hello world!");
        System.out.println("I Rule!" + "The World");
    }
}