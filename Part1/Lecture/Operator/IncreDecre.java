package Part1.Lecture.Operator;

public class IncreDecre {
    public static void main(String[] args) {

        // question1

        // this is pre,post increment and pre,post Decrement
        // a++; // 6
        // ++a; // 7
        // a--; // 6
        // --a; // 5

        // question 2

        // int a = 5;
        // a = ++a - a++ + --a + a--;

        // question 3

        // int a = 2;
        // a = a++ - --a + ++a - --a + a++ + a;

        // System.out.println(a);

        // question 4

        // int a = 2;
        // int b = 1;

        // a = --b + b - b++ + a - a++ - ++a + b;
        // b = --a + a - a++ + b - b++ - ++b + a;
        // System.out.println(a);
        // System.out.println(b);

        // question 5

        int a = 2;
        int b = 1;
        a = b++;
        b = a++;
        System.out.println(a);
        System.out.println(b);
    }
}
