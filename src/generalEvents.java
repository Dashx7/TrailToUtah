import java.util.Scanner;

public class generalEvents {
    Interactions I = new Interactions();
    Scanner myScanner = new Scanner(System.in);
    EnvironmentData data = new EnvironmentData();

    public void generalEvent1(){
        I.out("The bishop has asked you to pay extra to help for construction:");
        I.out("A: Pay nothing");
        I.out("B: Pay regular tithing");
        I.out("C: Pay double");
        I.out("D: Consecrate everything");
        String response = I.in(myScanner);

        if (response.compareToIgnoreCase("a")==0){
            I.out("Nothing paid, nothing ventured!");
            data.setMoney(data.getMoney()+20);
            data.setFaith(data.getFaith()-10);
        }
        else if (response.compareToIgnoreCase("b")==0) {
            I.out("Tithing paid, but not enough to fully support the church");
            data.setMoney(data.getMoney());
            data.setFaith(data.getFaith());
        }
        else if (response.compareToIgnoreCase("c")==0) {
            I.out("Tithing paid back double, little bit pricey, but your bishop is proud");
            int temp = (int)(data.getMoney()*(.8));
            data.setMoney(temp);
            data.setFaith(data.getFaith()+10);
        }
        else if (response.compareToIgnoreCase("d")==0) {
            I.out("All of your materials have been given to the church, and they returned what they saw fit");
            data.setMoney(30);
            data.setFaith(data.getFaith()+20);
            I.out("In reality, the law of consecration lasted from February 1831 to 1833 after being driven out of Jackson County ");
        }
    }
}
