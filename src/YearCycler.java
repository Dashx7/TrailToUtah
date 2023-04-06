import java.util.Random;
import java.util.Scanner;

public class YearCycler {
    Interactions I = new Interactions();
    Random myRandom = new Random();
    Scanner theScanner = new Scanner(System.in);

    public void reelingInTheYears() {

        String info;
        EData.currentYear+=1; //Increase the year every time I do things
        if (EData.currentYear <= 1846) {
            if (EData.hashMap.get(EData.currentYear) == null) { //Not a valid year and try again
                reelingInTheYears();
            }
            else {
                //Event Time, before info on the year
                int randomInt = myRandom.nextInt(0,100);
                if (randomInt>=60){ //40% chance of event occurring, lowering to make the game more informative
                    generalEvents event = new generalEvents();
                }

                //Info time!
                info = "In " + EData.currentYear + ": " + EData.hashMap.get(EData.currentYear);
                I.out(info);



            }
        }
        else {
            assert EData.currentYear > 1846;
            info = "You have finished the game!";
        }
        System.out.flush();

    }

    public void actionEvent() {

    }


}
