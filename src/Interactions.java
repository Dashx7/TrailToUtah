import java.util.Scanner;

/**
 * Convenient ways to interact with the system including input, output and sleep
 */
public class Interactions {

    public void out(String out){
        System.out.println(out + "\n");
        System.out.flush();
    }
    public String in(Scanner theScanner){
        return theScanner.nextLine();
    }
    public void sleep(int timeInMilliseconds){
        try {
            Thread.sleep(Long.parseLong(String.valueOf(timeInMilliseconds)));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void conditionalSleep(int timeInMilliseconds){
        if(EData.wait){
            sleep(timeInMilliseconds);
        }
    }
}
