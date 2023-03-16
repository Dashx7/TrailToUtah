import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Interactions I = new Interactions();
        EnvironmentData data = new EnvironmentData();
        Scanner myScanner = new Scanner(System.in);


        I.out("Hello, and welcome to the trail to Utah!");
        I.sleep(3000);
        I.out("You will mimic and learn about the lives of the saints as you travel west");
        I.sleep(2000);
        I.out("What is your name fellow saint?");
        data.setCharacterName(I.in(myScanner));
        I.sleep(1000);
        I.out("That's a nice name " + data.getCharacterName());





        String input = myScanner.nextLine();
        I.out(input);
    }
}