import java.util.Random;
import java.util.Scanner;

//import static java.lang.System.exit;

public class generalEvents {
    Interactions I = new Interactions();
    Scanner myScanner = new Scanner(System.in);
    Random myRand = new Random();

    public generalEvents(){
        if(EData.money<=0){
            I.out("You have no money left and have starved! Try holding on to it better next time");
            System.exit(0);
        }
        else if(EData.faith<=0){
            I.out("You have no faith left in the church and have been kicked! Try being more faithful next time");
            System.exit(0);
        }

        int randomInt = myRand.nextInt(0,100);

        if(EData.currentYear==1838){
            event1838();
        }
        else if(randomInt% EData.money <7){ //Decreased it to reduce it
            eventMoney1();
        }
        else {
            getRandomEvent();
        }
    }

    public void eventGeneral1(){
        I.out("Event: The bishop has asked you to pay extra to help for construction:");
        I.out("A: Pay nothing");
        I.out("B: Pay regular tithing");
        I.out("C: Pay double");
        I.out("D: Consecrate everything");
        String response = I.in(myScanner);

        if (response.compareToIgnoreCase("a")==0){
            I.out("Nothing paid, nothing ventured!");
            EData.money+=20;
            EData.faith-= 10;
        }
        else if (response.compareToIgnoreCase("b")==0) {
            I.out("Tithing paid, but not enough to fully support the church");
            //No change
        }
        else if (response.compareToIgnoreCase("c")==0) {
            I.out("Tithing paid back double, little bit pricey, but your bishop is proud");
            EData.money*=.8;
            EData.faith+=10;

        }
        else if (response.compareToIgnoreCase("d")==0) {
            I.out("All of your materials have been given to the church, and they returned what they saw fit");
            EData.money=30; //Set it back to 30
            EData.faith+=20;
            I.out("In reality, the law of consecration lasted from February 1831 to 1833 after being driven out of Jackson County ");
        }
        else {
            I.out("Not a valid response, lets try that again");
            eventGeneral1();
        }
    }

    public void event1838(){
        I.out("Event: Govern Boggs has declared the Mormon Extermination Order do you:");
        I.out("A: Defend your property against the attack");
        I.out("B: Leave behind everything");
        String response = I.in(myScanner);

        if (response.compareToIgnoreCase("a")==0){
            I.out("You fight against Missouri and");
            if(EData.wait){
                I.out(".");
                I.sleep(500);
                I.out(".");
                I.sleep(500);
                I.out(".");
                I.sleep(500);
            }

            int randomInt = myRand.nextInt(0,100);
            if(randomInt>10){
                if(EData.wait){ I.sleep(1000);}
                I.out("Live!");

                I.out("The saints flee from Missouri into Illinois during this time due to the attacks");
                I.out(EData.characterName + ", you will have to flee and can only carry half your total wealth with you");
                EData.money/=2;
            }
            else {
                I.out("Die!");
                I.out("In all reality only 22 people died in the Mormon war, but for the sake of the game you know?");
                System.exit(0);
            }
        }
        else if (response.compareToIgnoreCase("b")==0) {
            I.out("Tithing paid, but not enough to fully support the church");
            EData.money-=10;
        }
        else {
            I.out("Not a valid response");
            event1838();
        }
    }

    public void eventMoney1(){
        I.out("Event: You and your family are currently poor and can't afford food do you:");
        I.out("A: Pay upfront");
        I.out("B: Pray to God for food");
        I.out("C: Just die");
        String response = I.in(myScanner);

        if (response.compareToIgnoreCase("a")==0){
            I.out("Food has been paid for, but you notice you become even poorer");
            EData.money-=15;
            if(EData.wait){
                I.sleep(1000);
                I.out("In reality, 100's of saints starved while fleeing West, and had no opportunity to purchase food");

            }

        }
        else if (response.compareToIgnoreCase("b")==0) {

            I.out("You pray to God and hope that your faith is enough");
            int testDaFaith = myRand.nextInt(0,75);
            int faith =  testDaFaith/ EData.faith; //Bump up 75 to make it event harder
            if(faith == 0){
                I.out("Your faith was not enough... you find someone willing to sell you food but at exorbitant prices");
                EData.money-=30;
            }
            else {
                I.out("God has prepared a way for you! Food has been secured");
                if(EData.faith/2 > testDaFaith){
                    I.out("In fact, you were so faithful that God helped you procure some extra funds as well!!");
                    EData.money+=10;
                }
            }

        }
        else if (response.compareToIgnoreCase("c")==0) {
            I.out("I don't know what you were thinking with this one, but the sweet release of death washes over you as you ascend to heaven");
            System.exit(0);

        }
        else {
            I.out("Not a valid response, lets try that again");
            eventGeneral1();
        }
    }

    public void testEvent() {

        I.out("Which of the following Events occurred in " + EData.currentYear);

        int randomLetter = myRand.nextInt(0,4);
        String answer =String.valueOf('A'+randomLetter);

        for (int i = 0; i < 4; i++){
            if(i!=randomLetter){
                char myChar = (char) ('A' + i);
                String letter=String.valueOf(myChar);

                int randomInt = myRand.nextInt(0, EData.validYears.length);
                int randYear = EData.validYears[randomInt];
                String fact = EData.hashMap.get(randYear);
                I.out(letter + ": " + fact);
            }
            else{
                String fact = EData.hashMap.get(EData.currentYear);
                I.out(answer + fact);
            }

        }
        String in = I.in(myScanner);

        if(in ==answer){
            I.out("That is correct! Faith increased and a bonus reward has been claimed");
            EData.faith+=20;
            EData.money+=10;
        }



    }

    public void getRandomEvent(){
        int rand = myRand.nextInt(0,2);
        if (rand==0){
            eventGeneral1();
        }
        else if(rand==1){
            testEvent();
        }
    }
}
