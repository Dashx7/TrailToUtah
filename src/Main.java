import java.util.Scanner;

//This code is honestly yandere dev level of coding, so I apologize if you have to sift through this
public class Main {
    public static void main(String[] args) {


        Interactions I = new Interactions();
        EData.setUp();
        Scanner myScanner = new Scanner(System.in);


        I.out("\nHello, and welcome to the trail to Utah!");
        I.conditionalSleep(3000);
        I.out("You will mimic and learn about the lives of the saints as you follow the church through the years and travel west");
        I.conditionalSleep(2000);
        I.out("Press Enter to continue: (P.S. Please be patient with it, sometimes it takes a second for things to register)");
        I.in(myScanner);
        I.conditionalSleep(2000);
        I.out("What is your name fellow saint?");
        EData.characterName= (I.in(myScanner));
        I.conditionalSleep(1000);
        I.out("That's a nice name " + EData.characterName);

        YearCycler myEvents = new YearCycler();
        while (EData.currentYear <= 1848){
            myEvents.reelingInTheYears();
            I.conditionalSleep(500);
            I.out("Press Enter to continue, (S to view stats, F to toggle Quick Mode):");
            I.conditionalSleep(1200);
            if(I.in(myScanner).compareToIgnoreCase("s")==0){
                I.out("Year: " + EData.currentYear);
                I.out("Money: " + EData.money);
                I.out("Faith: " + EData.faith);
            }
            if(I.in(myScanner).compareToIgnoreCase("m")==0){
                EData.wait = !EData.wait;
            }
        }


        String input = myScanner.nextLine();
        I.out(input);
    }
}