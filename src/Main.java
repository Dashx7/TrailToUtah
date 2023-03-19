import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Interactions I = new Interactions();
        boolean wait = EData.wait;
        EData.setUp();
        Scanner myScanner = new Scanner(System.in);


        I.out("Hello, and welcome to the trail to Utah!");
        if(wait)I.sleep(3000);
        I.out("You will mimic and learn about the lives of the saints as you follow the church through the years and travel west");
        if(wait)I.sleep(2000);
        I.out("Press Enter to continue:");
        I.in(myScanner);
        if(wait)I.sleep(2000);
        I.out("What is your name fellow saint?");
        EData.characterName= (I.in(myScanner));
        if(wait)I.sleep(1000);
        I.out("That's a nice name " + EData.characterName);

        YearCycler myEvents = new YearCycler();
        while (EData.currentYear <= 1848){
            myEvents.reelingInTheYears();
            if (EData.wait){
                I.sleep(500);
            }
            I.out("Press Enter to continue:");
            if(I.in(myScanner).compareToIgnoreCase("s")==0){
                I.out("Year: " + EData.currentYear);
                I.out("Money: " + EData.money);
                I.out("Faith: " + EData.faith);
            }
            System.out.flush();
        }


        String input = myScanner.nextLine();
        I.out(input);
    }
}