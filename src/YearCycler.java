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
                info = "In " + EData.currentYear + ": " + EData.hashMap.get(EData.currentYear);
                I.out(info);

                //Event Time
                int randomInt = myRandom.nextInt(0,100);
                if (randomInt>=70){ //30% chance of event occurring, lowering to make the game more informative
                    generalEvents event = new generalEvents();
                }

            }
        }
        else {
            assert EData.currentYear > 1846;
            info = "You have finished the game!";
        }
        System.out.flush();

    }


//        info = "Many Saints began their journey to the Salt Lake Valley and the Nauvoo Temple was dedicated.";
//        info = "Joseph and Hyrum Smith were assassinated and The Quorum of the Twelve Apostles was sustained to lead the Church.";
//        info = "Revelation on eternal marriage and plural wives (D&C 132) was recorded.";
//        info = "The Relief Society was organized and Joseph Smith presented the endowment ordinance in Nauvoo.";
//        info = "Joseph Smith began teaching about baptisms for the dead.";
//        info = "The Saints in Missouri were forced to leave the state and Joseph Smith joined the Saints in Illinois and helped establish Nauvoo.";
//

    public void actionEvent() {

    }


}
