package ClassWork1;
import java.util.Scanner;

public class testFile
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        String Q= "What is your name?";
        System.out.println(Q);
        String R = a.nextLine();
        System.out.println("Nice to meet you"+","+R);
        a.close();
    }
}