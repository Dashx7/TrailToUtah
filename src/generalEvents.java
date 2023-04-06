import java.util.Random;
import java.util.Scanner;

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
        I.out("Event: The bishop has asked you to pay extra to help for construction of a new temple:");
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
            I.out("Tithing paid back double, little bit pricey, but your bishop is proud and your faith increases");
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
    public void eventGeneral2(){
        //You get sick in this disease
        I.out("Event: You have gotten sick with :");
        int diseaseIndex = myRand.nextInt(0,EData.diseases.length);
        if (diseaseIndex%2==1){
            diseaseIndex-=1; //Set it
        }
        String myDisease = EData.diseases[diseaseIndex];
        I.out(myDisease);

        I.out("Type I for information or Enter to skip");
        if(I.in(myScanner).compareToIgnoreCase("I")==0){
            I.out(EData.diseases[diseaseIndex+1]);
        }
        I.out("A: Work while sick");
        I.out("B: Pray to heal");
        String response = I.in(myScanner);

        if (response.compareToIgnoreCase("a")==0){
            I.out("You continue to work while sick");
            if(myRand.nextBoolean()){
                I.out("And it works! You are a bit richer and still healthy");
                EData.money+=20;
            }
            else{
                I.out("And it doesn't go well... you feel your faith in the church diminish");
                EData.faith-= 10;
            }
        }
        else if (response.compareToIgnoreCase("b")==0) {
            I.out("You either get a priesthood blessing or just pray and it is...");
            I.conditionalSleep(1000);
            if(myRand.nextInt(0,EData.faith) > 10){
                I.out("Successful!");
                I.conditionalSleep(1000);
                EData.faith+=10;
            }
            else {
                I.out("Unsuccessful. Dang.");
                I.conditionalSleep(1000);
                I.out("You pay for some medicine and it eventually clears up");
                I.conditionalSleep(1000);
                I.out("In reality, it wasn't that simple for latter day saints, but I the programmer am letting it slide");
                EData.money-=20;
            }
        }
        else {
            I.out("Not a valid response, lets try that again");
            eventGeneral1();
        }
    }

    public void event1838(){
        I.out("Event: Its 1838, Govern Boggs has declared the Mormon Extermination Order do you:");
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
                I.conditionalSleep(1000);
                I.out("Live!");
                I.conditionalSleep(1000);

                I.out("The saints flee from Missouri into Illinois during this time due to the attacks");
                I.conditionalSleep(1000);
                I.out("However this fighting gives you some extra time to pack your things and move out West");
                I.conditionalSleep(1000);
                I.out(EData.characterName + ", you will have to flee and can only carry some of your total wealth with you");
                EData.money/=1.5;
            }
            else {
                I.out("Die!");
                I.out("In all reality only 22 people died in the Mormon war, but for the sake of the game you know?");
                System.exit(0);
            }
        }
        else if (response.compareToIgnoreCase("b")==0) {
            I.out("You leave a lot ");
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
            I.conditionalSleep(1000);
            I.out("In reality, 100's of saints starved while fleeing West, and had no opportunity to purchase food");
            I.conditionalSleep(1000);


        }
        else if (response.compareToIgnoreCase("b")==0) {

            I.out("You pray to God and hope that your faith is enough");
            int testDaFaith = myRand.nextInt(0,75);
            int faith =  testDaFaith/ EData.faith; //Bump up 75 to make it event harder
            if(faith == 0){
                I.out("Your faith was not enough... you find someone willing to sell you food but at exorbitant prices");
                I.conditionalSleep(1000);
                EData.money-=30;
            }
            else {
                I.out("God has prepared a way for you! Food has been secured");
                if(EData.faith/2 > testDaFaith){
                    I.out("In fact, you were so faithful that God helped you procure some extra funds as well!!");
                    I.conditionalSleep(1000);
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
        char answerLetter = (char)('A' + randomLetter);
        String answer = String.valueOf(answerLetter);

        int[] answersAlreadyChosen = new int[4]; //An array of the years already chosen
        answersAlreadyChosen[randomLetter] = EData.currentYear;


        for (int i = 0; i < 4; i++){
            if(i!=randomLetter){
                char myChar = (char) ('A' + i);
                String letter=String.valueOf(myChar);

                int randomInt = myRand.nextInt(0, EData.validYears.length);
                int randYear = EData.validYears[randomInt];

                boolean retry = false;
                for (int year: answersAlreadyChosen) {
                    if ((year)==randYear){
                        i--;
                        retry = true;
                    }
                }
                if (retry){
                    continue;
                }
                String fact = EData.hashMap.get(randYear);
                I.out(letter + ": " + fact);
                answersAlreadyChosen[i] = randYear;
            }
            else{
                String fact = EData.hashMap.get(EData.currentYear);
                I.out(answer + ": " + fact);
            }

        }
        String in = I.in(myScanner);

        if(in.compareToIgnoreCase(answer)==0){
            I.out("That is correct! Faith increased and a bonus reward has been claimed");
            EData.faith+=20;
            EData.money+=10;
        }
        else {
            //You were dumb and it lets you know that
            String answerResponse = "That is incorrect, it actually was " + answerLetter + "; " + EData.hashMap.get(EData.currentYear);
            I.out(answerResponse);
        }



    }

    public void getRandomEvent(){
        int rand = myRand.nextInt(0,3);
        if (rand==0){
            eventGeneral1(); //Bishop One
        }
        else if(rand<=2){
            testEvent(); //Knowledge Test
        }
        else if (rand==3) {
            eventGeneral2(); //Sickness one
        }
    }
}
