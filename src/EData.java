import java.util.HashMap;
import java.util.Map;

public class EData {
    public static int faith = 0; //Will probably be from 0-100, start at 30
    public static String characterName = "notSetYet"; //I don't really do too much with these ngl
    public static int currentYear; //Year when the game is at
    public static int money; //0-100
    public static int turnsSinceLastEvent;
    public static boolean claimed100Money;
    public static boolean claimed100Faith;
    public static boolean isInQuorumOf12;


    public static boolean wait = true;

    static final int startYear = 1804; //Joseph smith is born (1 year before)

    static final int [] validYears = new int []{1805, 1820, 1823, 1827, 1829,1831,1833,1834,1836,1838,1839,1840,1842,1843,1844,1846};

    //Even indexes are the disease and odd are the descriptions
    static final String [] diseases = new String[]{
            "Cholera",
            "Cholera was a major epidemic disease that affected the early Latter-day Saints during their westward migration. The disease is caused by a bacterial infection and can lead to severe dehydration and death if left untreated.",
            "Dysentery",
            "Dysentery is an infection of the intestines that can cause severe diarrhea and dehydration. It was a common illness among the Saints during their journey westward.",
            "Typhoid fever",
            "Typhoid fever is a bacterial infection that can cause high fever, abdominal pain, and diarrhea. It was also a common disease among the early Latter-day Saints.",
            "Smallpox",
            "Smallpox is a highly contagious viral disease that causes fever, rash, and scarring. It was a significant health threat to the Saints during their migration.",
            "Measles",
            "Measles is a viral infection that can cause fever, rash, and respiratory symptoms. It was a common disease among children and adults during the westward migration",
            "Tuberculosis",
            "Tuberculosis is a bacterial infection that primarily affects the lungs. It was a significant health threat to the early Latter-day Saints, particularly during the winter months when respiratory infections were more common."
    };

    public static Map<Integer, String> hashMap = new HashMap<>() {{
        put(1805, "Joseph Smith was born");
        put(1820, "God the Father and His Son, Jesus Christ, appeared to Joseph Smith.");
        put(1823, "The angel Moroni first appeared to Joseph Smith.");
        put(1827, "Joseph Smith received the golden plates.");
        put(1829, "Joseph Smith completed the Book of Mormon translation and the Aaronic and Melchizedek Priesthoods were restored.");
        put(1830, "The Book of Mormon was published and the Church was organized.");
        put(1831, "Kirtland, Ohio, became a gathering place for the Saints");
        put(1833, "The Lord designated Independence, Missouri, as the place for the city of Zion.");
        put(1835, "The Quorum of the Twelve Apostles and the First Quorum of the Seventy were organized.");
        put(1836, "Joseph Smith led the camp of Israel (Zion’s Camp) from Ohio to Missouri.");
        put(1838, "Joseph Smith and other Church leaders moved to Far West, Missouri and Joseph Smith was imprisoned in Liberty Jail.");
        put(1839, "The Saints in Missouri were forced to leave the state and Joseph Smith joined the Saints in Illinois and helped establish Nauvoo.");
        put(1840, "Joseph Smith began teaching about baptisms for the dead.");
        put(1842, "The Relief Society was organized and Joseph Smith presented the endowment ordinance in Nauvoo.");
        put(1843, "Revelation on eternal marriage and plural wives (D&C 132) was recorded.");
        put(1844, "Joseph and Hyrum Smith were assassinated and The Quorum of the Twelve Apostles was sustained to lead the Church.");
        put(1846, "Many Saints began their journey to the Salt Lake Valley and the Nauvoo Temple was dedicated.");
    }};

    //Default constructor, Idk it just kinda exists
    public EData(){}

    public static void setUp(){
        //Adjust if you want to start the game differently
        faith = 35;
        money = 35;
        currentYear = startYear;
        turnsSinceLastEvent = 0;
        claimed100Faith = false;
        claimed100Money = false;
        isInQuorumOf12 = false;
    }

    // Getter setters
}
