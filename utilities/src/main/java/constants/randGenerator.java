package constants;
import java.util.Random;

public class randGenerator
{
    static Random randNum = new Random();
    public static final int getRandNumber = randNum.nextInt(4);
}