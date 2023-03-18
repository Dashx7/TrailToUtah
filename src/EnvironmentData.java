import java.util.HashMap;
import java.util.Map;

public class EnvironmentData {
    public static int faith = 0; //Will probably be from 0-100, start at 30
    public static String characterName = "notSetYet";
    public static int currentYear; //Year when the game is at
    public static int money; //0-100

    static final int startYear = 1805; //Joseph smith is born

    static int [] validYears = new int []{1805, 1820, 1823, 1827, 1829,1831,1833,1834,1836,1838,1839,1840,1842,1843,1844,1846};

    public Map<Integer, String> hashMap = new HashMap<Integer, String>()
    {{
        put(1805, "one");
    }};

    public EnvironmentData(){}

    public void setUp(){
        faith = 30;
        money = 30;
        setCurrentYear(startYear);
    }

    // Getter setters

    public int getFaith() {
        return faith;
    }

    public void setFaith(int faith) {
        this.faith = faith;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        EnvironmentData.currentYear = currentYear;
    }

    public void incrementCurrentYear() {
        currentYear++;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        EnvironmentData.money = money;
    }
}
