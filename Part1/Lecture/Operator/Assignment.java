package Part1.Lecture.Operator;

public class Assignment {
    public static void main(String[] args) {
        // int a ; Declearation
        // a=10; Initialization
        // swap the value without using Third variable

        int a = 10;
        int b = 30;
        a += b;
        b = a - b;
        a -= b;
        System.out.println(a);
        System.out.println(b);
    }

}
