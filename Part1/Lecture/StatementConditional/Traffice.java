package Part1.Lecture.StatementConditional;

public class Traffice {
    public static void main(String[] args) {
        char trafficLight = 'g';

        if (trafficLight == 'r' || trafficLight == 'R') {
            System.out.println("Stop ");
        } else if (trafficLight == 'y' || trafficLight == 'Y') {
            System.out.println("Get Ready");
        } else if (trafficLight == 'g' || trafficLight == 'G') {

            boolean wearhelmet = false;
            if (wearhelmet == true) {
                System.out.println("Go to home");
            } else {
                System.out.println("Pay the fine");
                boolean purse = false;
                if (purse == true) {
                    System.out.println("You pay the fine now go to home");
                } else {
                    System.out.println("Leave your bike and go to home with bad face");
                }
            }
        }
    }
}
