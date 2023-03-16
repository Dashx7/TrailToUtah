public class EnvironmentData {
    private int faith = 0; //Will probably be from 0-100
    private String characterName = "notSetYet";
    private int currentYear;


    public void setUp(){
        setFaith(0);
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


}
