package Part1.Lecture.StatementConditional;

public class Scase {
    public static void main(String[] args) {
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");

                break;
            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Value not match");
                break;
        }

    }
}
