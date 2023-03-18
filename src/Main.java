import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean wait = false;

        Interactions I = new Interactions();
        EnvironmentData data = new EnvironmentData(); //Figure out how to make it static?
        data.setUp();
        Scanner myScanner = new Scanner(System.in);


        I.out("Hello, and welcome to the trail to Utah!");
        if(wait)I.sleep(3000);
        I.out("You will mimic and learn about the lives of the saints as you travel west");
        if(wait)I.sleep(2000);
        I.out("What is your name fellow saint?");
        data.setCharacterName(I.in(myScanner));
        if(wait)I.sleep(1000);
        I.out("That's a nice name " + data.getCharacterName());

        EventGenerator myEvents = new EventGenerator();
        while (data.getCurrentYear() <= 1848){
            myEvents.reelingInTheYears();
            System.out.flush();
            I.in(myScanner);
        }


        String input = myScanner.nextLine();
        I.out(input);
    }
}