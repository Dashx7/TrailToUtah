import java.util.Random;


/**
 * This will cycle through the years, make sure that they are valid years
 * cause events, and tell you info about the current year
 */
public class YearCycler {
    Interactions I = new Interactions();
    Random myRandom = new Random();
    //Scanner theScanner = new Scanner(System.in);

    public void reelingInTheYears() {

        String info;
        EData.currentYear+=1; //Increase the year every time I do things
        if (EData.currentYear <= 1846) {
            if (EData.hashMap.get(EData.currentYear) == null) { //Not a valid year and try again
                reelingInTheYears();
            }
            else {
                //Prophet moment
                if(EData.isInQuorumOf12){
                    EData.faith+=5;
                }

                moneyAndFaithCheck();

                //Event Time, before info on the year
                int randomInt = myRandom.nextInt(0,100);
                if (randomInt>=60 || EData.turnsSinceLastEvent >=3){ //40% chance of event occurring, lowering to make the game more informative
                    generalEvents event = new generalEvents();
                    event.generalEventsStart();
                }
                else {
                    EData.turnsSinceLastEvent+=1;
                }

                //Info time!
                info = "In " + EData.currentYear + ": " + EData.hashMap.get(EData.currentYear);
                I.out(info);

            }
        }
        else {
            //assert EData.currentYear > 1846;
            I.out("You have finished the game!");
            if(EData.faith >=100){
                I.out("With immense faith at that!");
            }
            if(EData.faith >=100){
                I.out("With immense money at that!");
            }
            System.exit(0);
        }
        System.out.flush();

    }

    //Checking to see what should be done with certain levels of money and faith
    private void moneyAndFaithCheck() {
        if(EData.money<=0){
            I.out("You have no money left and have starved! Try holding on to it better next time");
            System.exit(0);
        }
        else if(EData.faith<=0){
            I.out("You have no faith left in the church and have been kicked! Try being more faithful next time");
            System.exit(0);
        }
        else if (EData.money>=100 && !EData.claimed100Money) {
            generalEvents.Money100Event();
        }
        else if (EData.faith>=100 && !EData.claimed100Faith) {
            generalEvents.Faith100Event();
        }
    }


}
