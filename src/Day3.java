import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Day3 {

    List<List<Integer>> integers = new ArrayList<List<Integer>>();

    Boolean[][] sheets = new Boolean[1000][1000];
    Integer collision = 0;
    List<Integer> overlap = new ArrayList<>();

    public void day3() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Day3Claim day3 = new Day3Claim();
            day3.number = scanner.nextInt();
            day3.left = scanner.nextInt();
            day3.top = scanner.nextInt();
            day3.rightTimes = scanner.nextInt();
            day3.botTimes = scanner.nextInt();
            day3.overlap = false;
            for (int i = 0; i < day3.botTimes; i++) {
                for (int j = 0; j < day3.rightTimes; j++) {
                    if (sheets[day3.top + i][day3.left + j] == null) {
                        sheets[day3.top + i][day3.left + j] = true;
                    } else if (sheets[day3.top + i][day3.left + j] == true) {
                        sheets[day3.top + i][day3.left + j] = false;
                        overlap.add(day3.number);
                        day3.overlap = true;
                    }
                }
            }
            System.out.println("OVERLAPSx");
            for (int i:overlap
                 ) {
                System.out.println(i);
            }
//            System.out.println(collision);
        }
    }
}
