package Part1.Lecture.Operator;

public class Logical {
    public static void main(String[] args) {

        // 1st

        char ch1 = 'A';
        int ch2 = ch1 + 4;
        char ch3 = 'E';

        boolean result1 = (ch3 != ch2) && (ch3 > ch1);
        boolean result2 = !((false) == (ch1 == ch2) == (ch2 != ch3) || (ch3 != ch2) && (ch3 >= ch1));
        System.out.println(result1);
        System.out.println(result2);

        // 2nd

        int a = 5;
        int b = 4;
        int c = b + 1;

        boolean result = !(!(((c == a) && (b != a)) || ((a != c) || (a == c))));

        System.out.println(result);

    }
}
