import javax.sound.sampled.Line;
import java.util.Scanner;

public class Day1 {
    public Integer day1(Integer totalFrequency){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
        totalFrequency+=scanner.nextInt();
        if(scanner.nextLine()==null){
            break;
        }
        }
        return totalFrequency;
    }
}
