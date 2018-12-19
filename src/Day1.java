import javax.sound.sampled.Line;
import java.util.HashMap;
import java.util.Scanner;

public class Day1 {
    HashMap<Integer, Integer> map = new HashMap<>();

    public Integer day1(Integer totalFrequency) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            map.put(totalFrequency,totalFrequency);
            totalFrequency += scanner.nextInt();
            if(map.containsKey(totalFrequency)){
                System.out.println("BREAK");
                System.out.println(totalFrequency);
                break;
            }
            else{
                map.put(totalFrequency,totalFrequency);
            }
            if (scanner.nextLine() == null) {
                break;
            }
        }
        return totalFrequency;
    }
}
