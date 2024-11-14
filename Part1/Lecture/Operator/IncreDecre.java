package Part1.Lecture.Operator;

public class IncreDecre {
    public static void main(String[] args) {

        // this is pre,post increment and pre,post Decrement
        // a++; // 6
        // ++a; // 7
        // a--; // 6
        // --a; // 5
        int a = 5;
        a = ++a - a++ + --a + a--;

        System.out.println(a);
    }
}
